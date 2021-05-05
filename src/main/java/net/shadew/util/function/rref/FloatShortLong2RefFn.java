package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code short} and a {@code long} and returns an object.
 */
public interface FloatShortLong2RefFn<R> {
    R invoke(float p1, short p2, long p3);
}
