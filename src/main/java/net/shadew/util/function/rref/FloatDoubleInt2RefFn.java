package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code double} and an {@code int} and returns an object.
 */
public interface FloatDoubleInt2RefFn<R> {
    R invoke(float p1, double p2, int p3);
}
