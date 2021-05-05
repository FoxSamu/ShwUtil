package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, an {@code int} and a {@code float} and returns an object.
 */
public interface IntIntFloat2RefFn<R> {
    R invoke(int p1, int p2, float p3);
}
