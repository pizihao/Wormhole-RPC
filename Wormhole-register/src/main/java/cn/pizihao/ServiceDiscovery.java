package cn.pizihao;

import java.util.Collection;

/**
 * 服务发现的顶级接口，包含所有已发现服务的查询筛选操作<br>
 * 这是一个顶级接口，由客户端和服务器端内部调用，用于适配不同的发现中心。<br>
 * 提供了服务发现的基本功能，但是在服务器端和客户端可能不会全部用到，根据其适配的不同发现中心，也会有某些接口无法被支持
 *
 * @author liuwenhao
 * @see Service
 */
public interface ServiceDiscovery {

    /**
     * 获取已注册服务的集合
     *
     * @return 发现的所有服务集合
     * @see Service
     */
    Collection<Service> getServiceUrls();

    /**
     * 获取执行名称的服务
     *
     * @param host 服务名称或服务的ip:port
     * @return 服务实例
     * @see Service
     */
    Collection<Service> getHostServiceUrls(String host);

}
