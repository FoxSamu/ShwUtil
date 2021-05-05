package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code float} and a {@code long} and returns an object.
 */
public interface IntFloatLong2RefFn<R> {
    R invoke(int p1, float p2, long p3);
}