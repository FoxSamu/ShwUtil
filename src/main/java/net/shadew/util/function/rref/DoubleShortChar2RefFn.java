package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code short} and a {@code char} and returns an object.
 */
public interface DoubleShortChar2RefFn<R> {
    R invoke(double p1, short p2, char p3);
}
