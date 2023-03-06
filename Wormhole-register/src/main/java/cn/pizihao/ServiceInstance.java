package cn.pizihao;

import java.net.InetAddress;
import java.net.InetSocketAddress;

public class ServiceInstance implements Service{

    @Override
    public String getServiceName() {
        return null;
    }

    @Override
    public InetSocketAddress getInetAddress() {
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
