package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code float} and a {@code double} and returns an object.
 */
public interface FloatFloatDouble2RefFn<R> {
    R invoke(float p1, float p2, double p3);
}
