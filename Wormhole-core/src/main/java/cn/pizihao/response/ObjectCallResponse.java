package cn.pizihao.response;

import java.util.Objects;

/**
 * 对象传输调用数据
 */
public class ObjectCallResponse implements Response {

    String RID;

    Class<?> cls;

    Object obj;

    Throwable throwable;

    String errMsg;

    boolean isEventHeart = false;

    public ObjectCallResponse(String RID, Class<?> cls, Object obj, Throwable throwable, String errMsg) {
        this.RID = RID;
        this.cls = cls;
        this.obj = obj;
        this.throwable = throwable;
        this.errMsg = errMsg;
    }

    public ObjectCallResponse(String RID, boolean isEventHeart) {
        this.RID = RID;
        this.isEventHeart = isEventHeart;
    }

    public String getRID() {
        return RID;
    }

    public Class<?> getCls() {
        return cls;
    }

    public Object getObj() {
        return obj;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public boolean isErr() {
        return throwable != null || errMsg != null;
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
        ObjectCallResponse that = (ObjectCallResponse) o;
        return Objects.equals(RID, that.RID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(RID);
    }
}
