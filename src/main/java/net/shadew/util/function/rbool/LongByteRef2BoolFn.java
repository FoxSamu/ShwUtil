package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code long}, a {@code byte} and an object and returns a {@code boolean}.
 */
public interface LongByteRef2BoolFn<P3> {
    boolean invoke(long p1, byte p2, P3 p3);
}
