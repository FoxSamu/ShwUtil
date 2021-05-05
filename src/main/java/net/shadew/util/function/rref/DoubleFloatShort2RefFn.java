package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code float} and a {@code short} and returns an object.
 */
public interface DoubleFloatShort2RefFn<R> {
    R invoke(double p1, float p2, short p3);
}
