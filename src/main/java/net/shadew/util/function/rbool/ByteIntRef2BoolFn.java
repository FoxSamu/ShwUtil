package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code byte}, an {@code int} and an object and returns a {@code boolean}.
 */
public interface ByteIntRef2BoolFn<P3> {
    boolean invoke(byte p1, int p2, P3 p3);
}
