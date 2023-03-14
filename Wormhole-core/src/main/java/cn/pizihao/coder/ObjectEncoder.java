package cn.pizihao.coder;

import cn.pizihao.exception.CoderException;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufOutputStream;
import io.netty.channel.ChannelHandlerContext;

import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 根据{@link io.netty.handler.codec.serialization.ObjectEncoder}实现的java对象解码器，必须确保传输的对象可以序列化
 */
public class ObjectEncoder extends io.netty.handler.codec.serialization.ObjectEncoder {

    private static final byte[] BYTE = new byte[4];

    @Override
    protected void encode(ChannelHandlerContext ctx, Serializable msg, ByteBuf out) throws Exception {
        int startIndex = out.writerIndex();
        try (ByteBufOutputStream outPut = new ByteBufOutputStream(out)) {
            outPut.write(BYTE);
            try (ObjectOutputStream outputStream = new CompactObjectOutputStream(outPut)) {
                outputStream.writeObject(msg);
                outputStream.flush();
            }
        } catch (Exception e) {
            throw new CoderException("编码异常，可能是传输对象无法序列化导致的");
        }
        int endIndex = out.writerIndex();
        out.setInt(startIndex, endIndex - startIndex - 4);
    }

}
