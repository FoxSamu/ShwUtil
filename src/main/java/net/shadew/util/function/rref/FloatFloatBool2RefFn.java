package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code float} and a {@code boolean} and returns an object.
 */
public interface FloatFloatBool2RefFn<R> {
    R invoke(float p1, float p2, boolean p3);
}
