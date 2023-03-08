package cn.pizihao.client;

import java.io.Closeable;

/**
 * 客户端<br>
 * 这是定义客户端的顶级接口，其任务是连接服务器端，发送数据，接收数据，断开连接<br>
 * 客户端需要一个连接的操作和一个断开的操作
 */
public interface Client extends Closeable {



}
