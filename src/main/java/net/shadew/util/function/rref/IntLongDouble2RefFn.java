package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code long} and a {@code double} and returns an object.
 */
public interface IntLongDouble2RefFn<R> {
    R invoke(int p1, long p2, double p3);
}
