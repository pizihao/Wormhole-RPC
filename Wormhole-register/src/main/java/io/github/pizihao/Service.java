package io.github.pizihao;

import java.net.InetAddress;

/**
 * 代表当前服务的基本信息以及当前服务和其他服务之间的关联关系
 *
 * @author liuwenhao
 */
public interface Service {

    /**
     * 获取当前服务的服务名称
     *
     * @return 服务名称，如果服务并没有在服务中心指定唯一的名称，则该项为ip:port，如无法组织成符合改格式的字符串，则报错
     */
    String getServiceName();

    /**
     * 获取服务地址的{@link InetAddress}的表示形式
     *
     * @return InetAddress
     */
    InetAddress getInetAddress();

    /**
     * 获取当前服务的ip地址
     *
     * @return host
     */
    String getHost();

    /**
     * 获取当前服务开放的端口号
     *
     * @return 端口号
     */
    int getPort();

}
