package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code short} and a {@code double} and returns an object.
 */
public interface DoubleShortDouble2RefFn<R> {
    R invoke(double p1, short p2, double p3);
}
