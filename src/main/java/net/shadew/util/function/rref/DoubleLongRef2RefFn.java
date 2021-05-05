package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code long} and an object and returns an object.
 */
public interface DoubleLongRef2RefFn<P3, R> {
    R invoke(double p1, long p2, P3 p3);
}
