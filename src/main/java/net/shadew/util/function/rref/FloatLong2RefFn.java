package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float} and a {@code long} and returns an object.
 */
public interface FloatLong2RefFn<R> {
    R invoke(float p1, long p2);
}
