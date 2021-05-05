package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code boolean} and a {@code float} and returns an object.
 */
public interface FloatBoolFloat2RefFn<R> {
    R invoke(float p1, boolean p2, float p3);
}
