package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code byte}, an object and an object and returns a {@code boolean}.
 */
public interface ByteRefRef2BoolFn<P2, P3> {
    boolean invoke(byte p1, P2 p2, P3 p3);
}
