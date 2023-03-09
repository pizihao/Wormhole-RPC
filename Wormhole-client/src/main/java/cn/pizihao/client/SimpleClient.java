package cn.pizihao.client;

import java.io.IOException;
import java.net.InetSocketAddress;

public class SimpleClient implements Client {
    @Override
    public void connect() {

    }

    @Override
    public InetSocketAddress getLocalAddress() {
        return null;
    }

    @Override
    public void send(Object message) {

    }

    @Override
    public Object getAttribute(String key) {
        return null;
    }

    @Override
    public void setAttribute(String key, Object value) {

    }

    @Override
    public boolean isActive() {
        return false;
    }

    @Override
    public void close() throws IOException {

    }
}
