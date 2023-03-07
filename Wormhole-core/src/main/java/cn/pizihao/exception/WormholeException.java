package cn.pizihao.exception;

public class WormholeException extends RuntimeException {
    private static final long serialVersionUID = 4220666905005394823L;

    public WormholeException() {
        super();
    }

    public WormholeException(Throwable throwable) {
        super(throwable);
    }

    public WormholeException(String message) {
        super(message);
    }

    public static WormholeException exception(String message) {
        return new WormholeException(message);
    }

    public static WormholeException exception(Throwable throwable) {
        if (throwable instanceof WormholeException) {
            return new WormholeException(throwable.getMessage());
        }
        return new WormholeException(throwable);
    }

    public static WormholeException of(String msg) {
        throw WormholeException.exception(msg);
    }

    public static WormholeException of(Throwable throwable) {
        throw WormholeException.exception(throwable);
    }
}
