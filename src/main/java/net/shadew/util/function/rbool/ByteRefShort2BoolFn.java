package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code byte}, an object and a {@code short} and returns a {@code boolean}.
 */
public interface ByteRefShort2BoolFn<P2> {
    boolean invoke(byte p1, P2 p2, short p3);
}
