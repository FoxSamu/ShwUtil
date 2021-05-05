package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, an {@code int} and a {@code boolean} and returns an object.
 */
public interface ShortIntBool2RefFn<R> {
    R invoke(short p1, int p2, boolean p3);
}
