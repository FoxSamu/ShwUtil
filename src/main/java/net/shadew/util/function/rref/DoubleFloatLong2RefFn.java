package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code float} and a {@code long} and returns an object.
 */
public interface DoubleFloatLong2RefFn<R> {
    R invoke(double p1, float p2, long p3);
}
