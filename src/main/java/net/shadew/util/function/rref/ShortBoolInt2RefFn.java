package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code boolean} and an {@code int} and returns an object.
 */
public interface ShortBoolInt2RefFn<R> {
    R invoke(short p1, boolean p2, int p3);
}
