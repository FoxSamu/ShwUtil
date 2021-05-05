package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code byte}, a {@code byte} and an object and returns a {@code boolean}.
 */
public interface ByteByteRef2BoolFn<P3> {
    boolean invoke(byte p1, byte p2, P3 p3);
}
