package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code byte}, a {@code double} and an object and returns a {@code boolean}.
 */
public interface ByteDoubleRef2BoolFn<P3> {
    boolean invoke(byte p1, double p2, P3 p3);
}
