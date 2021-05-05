package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code byte}, an object and an {@code int} and returns a {@code boolean}.
 */
public interface ByteRefInt2BoolFn<P2> {
    boolean invoke(byte p1, P2 p2, int p3);
}
