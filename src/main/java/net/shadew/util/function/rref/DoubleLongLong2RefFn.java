package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code long} and a {@code long} and returns an object.
 */
public interface DoubleLongLong2RefFn<R> {
    R invoke(double p1, long p2, long p3);
}
