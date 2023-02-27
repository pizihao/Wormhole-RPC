package cn.pizihao;

import java.util.List;

/**
 * 服务发现的顶级接口，包含服务发现的行为和后续的操作<br>
 * 这是一个顶级接口，由客户端和服务器端内部调用，用于适配不同的发现中心。<br>
 * 提供了服务发现的基本功能，但是在服务器端和客户端可能不会全部用到，根据其适配的不同发现中心，也会有某些接口无法被支持
 *
 * @author liuwehao
 */
public interface ServiceDiscover {

    /**
     * 订阅服务
     *
     * @param service 订阅的服务名
     */
    void subscribe(String service);

    /**
     * 取消订阅
     *
     * @param service 取消订阅的服务名
     */
    void unsubscribe(String service);

    /**
     * 可以被订阅的所有服务
     *
     * @return 所有的服务名
     */
    List<String> discover();
}
