package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, an {@code int} and an object and returns an object.
 */
public interface ShortIntRef2RefFn<P3, R> {
    R invoke(short p1, int p2, P3 p3);
}
