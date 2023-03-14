package cn.pizihao.channel;

/**
 * 时间限制的接口
 */
public interface ITimeout {

    /**
     * 获取连接的超时时长，ms
     */
    long timeout();

    /**
     * 设置连接的超时时长，ms
     */
    void setTimeout(long timeout);
}
