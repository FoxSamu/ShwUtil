package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code char} and a {@code short} and returns an object.
 */
public interface DoubleCharShort2RefFn<R> {
    R invoke(double p1, char p2, short p3);
}
