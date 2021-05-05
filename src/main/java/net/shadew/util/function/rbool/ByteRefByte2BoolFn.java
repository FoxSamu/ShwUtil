package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code byte}, an object and a {@code byte} and returns a {@code boolean}.
 */
public interface ByteRefByte2BoolFn<P2> {
    boolean invoke(byte p1, P2 p2, byte p3);
}
