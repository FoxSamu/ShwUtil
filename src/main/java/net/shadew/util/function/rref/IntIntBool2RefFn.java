package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, an {@code int} and a {@code boolean} and returns an object.
 */
public interface IntIntBool2RefFn<R> {
    R invoke(int p1, int p2, boolean p3);
}
