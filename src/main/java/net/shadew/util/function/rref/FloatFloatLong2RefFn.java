package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code float} and a {@code long} and returns an object.
 */
public interface FloatFloatLong2RefFn<R> {
    R invoke(float p1, float p2, long p3);
}
