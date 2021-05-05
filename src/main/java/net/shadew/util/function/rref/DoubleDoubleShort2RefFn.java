package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code double} and a {@code short} and returns an object.
 */
public interface DoubleDoubleShort2RefFn<R> {
    R invoke(double p1, double p2, short p3);
}
