package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int} and an {@code int} and returns an object.
 */
public interface IntInt2RefFn<R> {
    R invoke(int p1, int p2);
}
