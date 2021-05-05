package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code long} and a {@code float} and returns an object.
 */
public interface ShortLongFloat2RefFn<R> {
    R invoke(short p1, long p2, float p3);
}
