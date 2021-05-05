package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int} and a {@code boolean} and returns an object.
 */
public interface IntBool2RefFn<R> {
    R invoke(int p1, boolean p2);
}
