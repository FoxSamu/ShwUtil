package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code double} and a {@code long} and returns an object.
 */
public interface IntDoubleLong2RefFn<R> {
    R invoke(int p1, double p2, long p3);
}
