package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code long} and a {@code boolean} and returns an object.
 */
public interface IntLongBool2RefFn<R> {
    R invoke(int p1, long p2, boolean p3);
}
