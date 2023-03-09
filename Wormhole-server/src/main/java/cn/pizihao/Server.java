package cn.pizihao;

import cn.pizihao.channel.Channel;

import java.io.Closeable;

/**
 * 服务器端
 */
public interface Server extends Channel, Closeable {

    /**
     * 绑定一个端口，同时启动服务
     */
    void bind();
}
