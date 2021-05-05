package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean} and an {@code int} and returns an object.
 */
public interface BoolInt2RefFn<R> {
    R invoke(boolean p1, int p2);
}