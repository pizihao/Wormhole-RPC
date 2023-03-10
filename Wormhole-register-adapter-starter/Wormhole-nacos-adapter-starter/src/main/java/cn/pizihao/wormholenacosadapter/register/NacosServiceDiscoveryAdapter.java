package cn.pizihao.wormholenacosadapter.register;


import cn.pizihao.Service;
import cn.pizihao.ServiceDiscovery;
import cn.pizihao.wormholenacosadapter.exception.ServiceNotFindException;
import com.alibaba.cloud.nacos.discovery.NacosServiceDiscovery;
import com.alibaba.nacos.api.exception.NacosException;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * 针对服务注册的适配，适配nacos注册中心
 */
public class NacosServiceDiscoveryAdapter implements ServiceDiscovery {

    private final NacosServiceDiscovery nacosServiceDiscovery;

    public NacosServiceDiscoveryAdapter(NacosServiceDiscovery nacosServiceDiscovery) {
        this.nacosServiceDiscovery = nacosServiceDiscovery;
    }

    @Override
    public Collection<Service> getServiceInstances() {
        try {
            return nacosServiceDiscovery
                    .getServices()
                    .stream()
                    .map(this::getHostServiceInstances)
                    .flatMap(Collection::stream)
                    .collect(Collectors.toList());
        } catch (NacosException e) {
            throw new ServiceNotFindException(e);
        }
    }

    @Override
    public Collection<Service> getHostServiceInstances(String host) {
        try {
            return nacosServiceDiscovery.getInstances(host)
                    .stream()
                    .map(NacosServiceInstance::new)
                    .collect(Collectors.toList());
        } catch (NacosException e) {
            throw new ServiceNotFindException(e);
        }
    }
}
