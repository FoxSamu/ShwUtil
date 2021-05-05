package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code double} and a {@code double} and returns an object.
 */
public interface DoubleDoubleDouble2RefFn<R> {
    R invoke(double p1, double p2, double p3);
}
