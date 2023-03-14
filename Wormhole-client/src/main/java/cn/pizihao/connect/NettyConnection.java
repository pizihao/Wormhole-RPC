package cn.pizihao.connect;

import cn.pizihao.exception.ConnectException;

import java.io.IOException;

/**
 * 基于netty的连接连接实现，负责和服务器端建立连接，这是客户端专有的
 */
public class NettyConnection implements Connection {


    @Override
    public long timeout() {
        return 0;
    }

    @Override
    public void setTimeout(long timeout) {

    }

    @Override
    public void connect() throws ConnectException {

    }

    @Override
    public void close() throws IOException {

    }
}
