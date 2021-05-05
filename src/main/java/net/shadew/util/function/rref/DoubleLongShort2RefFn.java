package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code long} and a {@code short} and returns an object.
 */
public interface DoubleLongShort2RefFn<R> {
    R invoke(double p1, long p2, short p3);
}
