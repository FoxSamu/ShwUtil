package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code boolean} and an {@code int} and returns an object.
 */
public interface IntBoolInt2RefFn<R> {
    R invoke(int p1, boolean p2, int p3);
}
