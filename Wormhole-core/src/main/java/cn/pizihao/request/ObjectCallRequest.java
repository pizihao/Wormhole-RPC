package cn.pizihao.request;

/**
 * 对象传输传递数据
 */
public class ObjectCallRequest implements Request {

    public String getRID() {
        return null;
    }

    public String getClassName() {
        return null;
    }

    public String getMethodName() {
        return null;
    }

    public Class<?>[] getParameterTypes() {
        return new Class[0];
    }

    public Object[] getParameters() {
        return new Object[0];
    }

    public boolean isReceive() {
        return false;
    }

    public boolean isEventHeart() {
        return false;
    }
}
