package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code float} and a {@code double} and returns an object.
 */
public interface DoubleFloatDouble2RefFn<R> {
    R invoke(double p1, float p2, double p3);
}
