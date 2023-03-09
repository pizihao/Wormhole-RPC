package cn.pizihao.channel;

import java.net.InetSocketAddress;

/**
 * 建立于服务端和客户端的通道
 */
public interface Channel {

    /**
     * 获取地址
     *
     * @return InetSocketAddress
     */
    InetSocketAddress getLocalAddress();

    /**
     * 发送信息
     *
     * @param message 信息，
     */
    void send(Object message);

    /**
     * 获取参数
     *
     * @param key 参数的key
     * @return 参数值
     */
    Object getAttribute(String key);

    /**
     * 设置一个参数
     *
     * @param key   参数key
     * @param value 值
     */
    void setAttribute(String key, Object value);

    /**
     * 检查客户端是否活跃
     *
     * @return 结果
     */
    boolean isActive();

}
