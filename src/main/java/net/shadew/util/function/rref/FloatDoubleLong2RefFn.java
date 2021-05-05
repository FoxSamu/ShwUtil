package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code double} and a {@code long} and returns an object.
 */
public interface FloatDoubleLong2RefFn<R> {
    R invoke(float p1, double p2, long p3);
}
