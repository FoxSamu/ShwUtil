package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code boolean} and an {@code int} and returns an object.
 */
public interface LongBoolInt2RefFn<R> {
    R invoke(Long p1, Bool p2, Int p3);
}
