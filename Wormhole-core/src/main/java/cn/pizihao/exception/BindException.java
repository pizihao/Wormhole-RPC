package cn.pizihao.exception;

/**
 * 在服务器端绑定端口的过程中，如果发生异常，则抛出类型为{@link BindException}的异常，
 * 它与{@link WormholeException}没有什么不同，但是异常的类型更明确
 */
public class BindException extends WormholeException {

    private static final long serialVersionUID = 8247610319171014183L;

    public BindException() {
        super();
    }

    public BindException(String message) {
        super(message);
    }

}
