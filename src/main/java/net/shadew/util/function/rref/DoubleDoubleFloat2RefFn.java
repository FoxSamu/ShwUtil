package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code double} and a {@code float} and returns an object.
 */
public interface DoubleDoubleFloat2RefFn<R> {
    R invoke(double p1, double p2, float p3);
}
