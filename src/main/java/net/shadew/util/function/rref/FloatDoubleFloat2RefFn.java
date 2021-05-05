package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code double} and a {@code float} and returns an object.
 */
public interface FloatDoubleFloat2RefFn<R> {
    R invoke(float p1, double p2, float p3);
}
