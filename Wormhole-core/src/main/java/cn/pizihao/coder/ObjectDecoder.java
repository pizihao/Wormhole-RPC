package cn.pizihao.coder;

import cn.pizihao.exception.CoderException;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.serialization.ClassResolver;

/**
 * 根据{@link io.netty.handler.codec.serialization.ObjectDecoder}实现的java对象解码器，有必要确保传输的对象可以串行化
 */
public class ObjectDecoder extends io.netty.handler.codec.serialization.ObjectDecoder {
    public ObjectDecoder(ClassResolver classResolver) {
        super(classResolver);
    }

    @Override
    protected Object decode(ChannelHandlerContext ctx, ByteBuf in) {
        ByteBuf byteBuf = in.duplicate();
        try {
            Object o = super.decode(ctx, in);
            if (o == null) {
                return byteBuf;
            } else {
                return o;
            }
        } catch (Exception e) {
            throw new CoderException("编码异常，可能是由于传输对象反序列化失败导致");
        }
    }
}
