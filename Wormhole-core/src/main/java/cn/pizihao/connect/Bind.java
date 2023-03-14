package cn.pizihao.connect;

import cn.pizihao.channel.ITimeout;
import cn.pizihao.exception.BindException;

import java.io.Closeable;

/**
 * 用于服务器端绑定端口
 */
public interface Bind extends Closeable, ITimeout {

    /**
     * 绑定一个端口。开启服务器端
     */
    void bind() throws BindException;

}
