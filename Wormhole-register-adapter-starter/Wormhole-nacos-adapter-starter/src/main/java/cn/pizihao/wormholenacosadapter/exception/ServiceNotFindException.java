package cn.pizihao.wormholenacosadapter.exception;


import cn.pizihao.exception.WormholeException;

public class ServiceNotFindException extends WormholeException {

    public ServiceNotFindException() {
    }

    public ServiceNotFindException(Throwable throwable) {
        super(throwable);
    }

    public ServiceNotFindException(String message) {
        super(message);
    }

    public static ServiceNotFindException exception(Throwable throwable) {
        if (throwable instanceof ServiceNotFindException) {
            return new ServiceNotFindException(throwable.getMessage());
        }
        return new ServiceNotFindException(throwable);
    }

    public static ServiceNotFindException of(String msg) {
        throw ServiceNotFindException.exception(msg);
    }

    public static ServiceNotFindException of(Throwable throwable) {
        throw ServiceNotFindException.exception(throwable);
    }

}
