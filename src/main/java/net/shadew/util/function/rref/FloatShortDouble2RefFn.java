package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code short} and a {@code double} and returns an object.
 */
public interface FloatShortDouble2RefFn<R> {
    R invoke(float p1, short p2, double p3);
}
