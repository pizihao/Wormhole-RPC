package cn.pizihao.connect;

import cn.pizihao.channel.ITimeout;
import cn.pizihao.exception.ConnectException;

import java.io.Closeable;

/**
 * 一种连接的状态，代表一个客户端和服务器端之间的连接。<br>
 * 注意：连接意味着两个端点直接会存在一个通道，但是并不意味之里面会存在数据，连接和通道是同时出现同时关闭的
 */
public interface Connection extends Closeable, ITimeout {

    /**
     * 建立连接
     *
     * @throws ConnectException 如果连接失败
     */
    void connect() throws ConnectException;

}