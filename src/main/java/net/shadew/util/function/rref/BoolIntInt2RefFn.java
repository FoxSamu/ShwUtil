package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, an {@code int} and an {@code int} and returns an object.
 */
public interface BoolIntInt2RefFn<R> {
    R invoke(boolean p1, int p2, int p3);
}
