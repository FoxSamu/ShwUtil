package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, an {@code int} and an {@code int} and returns an object.
 */
public interface IntIntInt2RefFn<R> {
    R invoke(int p1, int p2, int p3);
}
