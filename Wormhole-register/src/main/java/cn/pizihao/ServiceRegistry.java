package cn.pizihao;

import java.util.Collection;

/**
 * 服务注册的顶级接口，包含服务注册的行为和后续的操作<br>
 * 这是一个顶级接口，由客户端和服务器端内部调用，用于适配不同的注册中心。<br>
 * 提供了服务注册的基本功能，但是在服务器端和客户端可能不会全部用到，根据其适配的不同注册中心，也会有某些接口无法被支持
 *
 * @author liuwenhao
 * @see String
 */
public interface ServiceRegistry {

    /**
     * 向注册中心注册服务
     *
     * @param service 注册到注册中心的服务名
     * @see String
     */
    void register(String service);

    /**
     * 从注册中心删除服务
     *
     * @param service 需要在服务中心剔除的服务名
     * @see String
     */
    void unregister(String service);

    /**
     * 将服务设置为可用，供客户端调用
     *
     * @param service 需要启用的服务名
     * @see String
     */
    void available(String service);

    /**
     * 禁用服务，停止服务发现
     *
     * @param service 需要禁用的服务名
     * @see String
     */
    void unavailable(String service);

    /**
     * 获取已注册服务的集合
     *
     * @return 注册的所有服务集合
     * @see String
     */
    Collection<String> getServiceUrls();

    /**
     * 获取已注册的并启用的服务集合
     *
     * @return 所有可供使用的服务集合
     * @see String
     */
    Collection<String> getAvailableServiceUrls();

}
