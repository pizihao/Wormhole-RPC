package cn.pizihao.wormholenacosadapter.register;

import cn.pizihao.Service;
import org.springframework.cloud.client.ServiceInstance;

import java.net.InetAddress;
import java.util.Optional;

public class NacosServiceInstance implements Service {

    ServiceInstance serviceInstance;

    public NacosServiceInstance(ServiceInstance serviceInstance) {
        this.serviceInstance = serviceInstance;
    }

    @Override
    public String getServiceName() {
        return Optional.ofNullable(serviceInstance.getServiceId())
                .orElseGet(() -> serviceInstance.getHost());
    }

    @Override
    public InetAddress getInetAddress() {
        return null;
    }

    @Override
    public String getHost() {
        return null;
    }

    @Override
    public int getPort() {
        return 0;
    }
}
