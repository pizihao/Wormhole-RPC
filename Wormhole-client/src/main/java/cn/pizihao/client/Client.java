package cn.pizihao.client;

import cn.pizihao.channel.Channel;

import java.io.Closeable;

/**
 * 客户端<br>
 * 这是定义客户端的顶级接口，其任务是连接服务器端，发送数据，接收数据，断开连接<br>
 * 客户端需要一个连接的操作和一个断开的操作<br>
 * 客户端是一个有状态的量，一个客户端在一个时刻值呢连接一个服务器端，进行数据传输
 */
public interface Client extends Channel, Closeable {

    /**
     * 建立服务器端和客户端的连接
     */
    void connect();

}
