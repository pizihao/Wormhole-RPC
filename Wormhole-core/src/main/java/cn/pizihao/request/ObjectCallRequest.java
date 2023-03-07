package cn.pizihao.request;

import java.util.Objects;

/**
 * 对象传输传递数据
 */
public class ObjectCallRequest implements Request {

    String RID;

    String className;

    String methodName;

    Class<?>[] parameterTypes;

    Object[] parameters;

    boolean isReceive = true;

    boolean isEventHeart = false;


    public ObjectCallRequest(String RID, String className, String methodName, Class<?>[] parameterTypes, Object[] parameters, boolean isReceive) {
        this.RID = RID;
        this.className = className;
        this.methodName = methodName;
        this.parameterTypes = parameterTypes;
        this.parameters = parameters;
        this.isReceive = isReceive;
    }

    public ObjectCallRequest(String RID, String className, String methodName, Class<?>[] parameterTypes, Object[] parameters) {
        this.RID = RID;
        this.className = className;
        this.methodName = methodName;
        this.parameterTypes = parameterTypes;
        this.parameters = parameters;
    }

    public ObjectCallRequest(String RID, boolean isEventHeart) {
        this.RID = RID;
        this.isEventHeart = isEventHeart;
    }

    public String getRID() {
        return RID;
    }

    public String getClassName() {
        return className;
    }

    public String getMethodName() {
        return methodName;
    }

    public Class<?>[] getParameterTypes() {
        return parameterTypes;
    }

    public Object[] getParameters() {
        return parameters;
    }

    public boolean isReceive() {
        return isReceive;
    }

    public boolean isEventHeart() {
        return isEventHeart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ObjectCallRequest that = (ObjectCallRequest) o;
        return Objects.equals(RID, that.RID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(RID);
    }
}
