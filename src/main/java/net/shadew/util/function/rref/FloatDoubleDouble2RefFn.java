package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code double} and a {@code double} and returns an object.
 */
public interface FloatDoubleDouble2RefFn<R> {
    R invoke(float p1, double p2, double p3);
}
