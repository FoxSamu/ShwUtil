package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code boolean} and a {@code long} and returns an object.
 */
public interface IntBoolLong2RefFn<R> {
    R invoke(int p1, boolean p2, long p3);
}
