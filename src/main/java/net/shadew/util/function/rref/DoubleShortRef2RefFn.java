package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code short} and an object and returns an object.
 */
public interface DoubleShortRef2RefFn<P3, R> {
    R invoke(double p1, short p2, P3 p3);
}
