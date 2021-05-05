package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code short} and an {@code int} and returns an object.
 */
public interface ShortShortInt2RefFn<R> {
    R invoke(short p1, short p2, int p3);
}
