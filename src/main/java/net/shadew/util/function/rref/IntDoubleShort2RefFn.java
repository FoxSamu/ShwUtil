package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code double} and a {@code short} and returns an object.
 */
public interface IntDoubleShort2RefFn<R> {
    R invoke(int p1, double p2, short p3);
}
