package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code short} and a {@code float} and returns an object.
 */
public interface DoubleShortFloat2RefFn<R> {
    R invoke(double p1, short p2, float p3);
}
