package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code long} and a {@code char} and returns an object.
 */
public interface DoubleLongChar2RefFn<R> {
    R invoke(double p1, long p2, char p3);
}
