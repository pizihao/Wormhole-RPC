package cn.pizihao.wormholenacosadapter.register;

import cn.pizihao.Service;
import cn.pizihao.wormholenacosadapter.exception.ServiceNotFindException;
import org.springframework.cloud.client.ServiceInstance;

import java.net.InetSocketAddress;
import java.util.Optional;

public class NacosServiceInstance implements Service {

    private final ServiceInstance serviceInstance;

    public NacosServiceInstance(ServiceInstance serviceInstance) {
        this.serviceInstance = serviceInstance;
    }

    @Override
    public String getServiceName() {
        return Optional.ofNullable(serviceInstance.getServiceId())
                .orElseGet(serviceInstance::getHost);
    }

    @Override
    public InetSocketAddress getInetAddress() {
        String host = getHost();
        int port = getPort();
        return new InetSocketAddress(host, port);
    }

    @Override
    public String getHost() {
        return Optional.ofNullable(serviceInstance.getHost())
                .orElseThrow(() -> ServiceNotFindException.exception("没有定位到服务的地址信息"));
    }

    @Override
    public int getPort() {
        return serviceInstance.getPort();
    }
}
