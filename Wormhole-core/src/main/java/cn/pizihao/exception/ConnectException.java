package cn.pizihao.exception;

/**
 * 在客户端和服务器端连接的过程中，如果发生异常，则抛出类型为{@link ConnectException}的异常，
 * 它与{@link WormholeException}没有什么不同，但是异常的类型更明确
 */
public class ConnectException extends WormholeException {

    private static final long serialVersionUID = 8247610319171014183L;

    public ConnectException() {
        super();
    }

    public ConnectException(String message) {
        super(message);
    }

}
