package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code short} and a {@code short} and returns an object.
 */
public interface DoubleShortShort2RefFn<R> {
    R invoke(double p1, short p2, short p3);
}
