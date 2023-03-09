package cn.pizihao.server;

import cn.pizihao.channel.Channel;

/**
 * 服务器端
 */
public interface Server extends Channel, AutoCloseable {

    /**
     * 绑定一个端口，同时启动服务
     */
    void bind();
}
