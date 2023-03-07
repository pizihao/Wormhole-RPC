package cn.pizihao.response;

/**
 * 响应体，客户端接收来自服务器端的响应，应包含以下基本信息<br>
 * <ul>
 *     <li>随机标识id，用于确定返回值</li>
 *     <li>返回值的类型</li>
 *     <li>返回的对象</li>
 *     <li>异常体和异常信息</li>
 *     <li>是否存在异常</li>
 *     <li>是否心跳检测响应</li>
 * </ul>
 */
public interface Response {

    /**
     * RID，标识信息
     */
    String getRID();

    /**
     * 返回值的类，用于反序列化
     */
    Class<?> getCls();

    /**
     * 返回的对象
     */
    Object getObj();

    /**
     * 当前响应中的异常
     */
    Throwable getThrowable();

    /**
     * 异常信息
     */
    String getErrMsg();

    /**
     * 当前响应中是否存在异常
     */
    boolean isErr();

    /**
     * 是否是心跳事件响应
     */
    boolean isEventHeart();

}
