package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double} and a {@code short} and returns an object.
 */
public interface DoubleShort2RefFn<R> {
    R invoke(double p1, short p2);
}
