package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code float} and a {@code long} and returns an object.
 */
public interface ShortFloatLong2RefFn<R> {
    R invoke(short p1, float p2, long p3);
}
