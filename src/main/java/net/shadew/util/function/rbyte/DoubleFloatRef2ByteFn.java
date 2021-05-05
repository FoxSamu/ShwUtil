package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code double}, a {@code float} and an object and returns a {@code byte}.
 */
public interface DoubleFloatRef2ByteFn<P3> {
    byte invoke(double p1, float p2, P3 p3);
}
