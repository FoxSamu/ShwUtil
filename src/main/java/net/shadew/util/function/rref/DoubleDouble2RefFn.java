package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double} and a {@code double} and returns an object.
 */
public interface DoubleDouble2RefFn<R> {
    R invoke(double p1, double p2);
}
