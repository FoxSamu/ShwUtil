package net.shadew.util.function.rbool;

/**
 * A function that takes a {@code double}, a {@code byte} and an object and returns a {@code boolean}.
 */
public interface DoubleByteRef2BoolFn<P3> {
    boolean invoke(double p1, byte p2, P3 p3);
}
