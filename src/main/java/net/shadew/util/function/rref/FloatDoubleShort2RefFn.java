package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code double} and a {@code short} and returns an object.
 */
public interface FloatDoubleShort2RefFn<R> {
    R invoke(float p1, double p2, short p3);
}
