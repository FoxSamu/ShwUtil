package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code double} and a {@code double} and returns an object.
 */
public interface IntDoubleDouble2RefFn<R> {
    R invoke(int p1, double p2, double p3);
}