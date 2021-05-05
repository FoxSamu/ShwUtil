package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code float} and an object and returns an object.
 */
public interface DoubleFloatRef2RefFn<P3, R> {
    R invoke(double p1, float p2, P3 p3);
}
