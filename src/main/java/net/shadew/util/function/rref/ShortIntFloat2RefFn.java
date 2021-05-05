package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, an {@code int} and a {@code float} and returns an object.
 */
public interface ShortIntFloat2RefFn<R> {
    R invoke(short p1, int p2, float p3);
}
