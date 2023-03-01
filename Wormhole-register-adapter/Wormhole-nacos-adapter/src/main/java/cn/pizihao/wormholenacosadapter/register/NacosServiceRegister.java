package cn.pizihao.wormholenacosadapter.register;


import cn.pizihao.Service;
import cn.pizihao.ServiceDiscovery;
import com.alibaba.cloud.nacos.registry.NacosServiceRegistry;

import java.util.Collection;

/**
 * 针对服务注册的适配，适配nacos注册中心
 */
public class NacosServiceRegister implements ServiceDiscovery {

    private NacosServiceRegistry registry;

    public NacosServiceRegister(NacosServiceRegistry registry) {
        this.registry = registry;
    }

    @Override
    public Collection<Service> getServiceUrls() {
        return null;
    }

    @Override
    public Collection<Service> getHostServiceUrls(String host) {
        return null;
    }
}
