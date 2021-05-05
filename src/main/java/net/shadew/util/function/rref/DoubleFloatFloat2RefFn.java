package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code float} and a {@code float} and returns an object.
 */
public interface DoubleFloatFloat2RefFn<R> {
    R invoke(double p1, float p2, float p3);
}
