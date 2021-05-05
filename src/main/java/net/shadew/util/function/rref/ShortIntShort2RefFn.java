package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, an {@code int} and a {@code short} and returns an object.
 */
public interface ShortIntShort2RefFn<R> {
    R invoke(short p1, int p2, short p3);
}
