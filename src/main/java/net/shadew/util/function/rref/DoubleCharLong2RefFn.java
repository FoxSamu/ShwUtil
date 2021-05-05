package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code char} and a {@code long} and returns an object.
 */
public interface DoubleCharLong2RefFn<R> {
    R invoke(double p1, char p2, long p3);
}
