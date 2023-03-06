package cn.pizihao.request;

/**
 * 请求体，应该包含如下的信息：<br>
 * <ul>
 *     <li>随机标识id，用于确定返回值</li>
 *     <li>调用类全限定名</li>
 *     <li>调用方法名</li>
 *     <li>调用的参数列表</li>
 *     <li>调用的参数</li>
 *     <li>是否接收响应</li>
 *     <li>是否事件请求</li>
 * </ul>
 */
public interface Request {

    /**
     * RID，标识信息
     */
    String getRID();

    /**
     * 类全路径名
     */
    String getClassName();

    /**
     * 方法名
     */
    String getMethodName();

    /**
     * 参数类型列表
     */
    Class<?>[] getParameterTypes();

    /**
     * 参数类型
     */
    Object[] getParameters();

    /**
     * 是否接收服务器端的响应
     */
    boolean isReceive();

    /**
     * 是否是心跳事件请求
     */
    boolean isEventHeart();

}
