package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, an {@code int} and an {@code int} and returns an object.
 */
public interface ShortIntInt2RefFn<R> {
    R invoke(short p1, int p2, int p3);
}
