package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code float} and an {@code int} and returns an object.
 */
public interface FloatFloatInt2RefFn<R> {
    R invoke(float p1, float p2, int p3);
}
