package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code long} and a {@code float} and returns an object.
 */
public interface DoubleLongFloat2RefFn<R> {
    R invoke(double p1, long p2, float p3);
}
