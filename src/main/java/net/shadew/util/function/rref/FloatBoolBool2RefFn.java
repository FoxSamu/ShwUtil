package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code boolean} and a {@code boolean} and returns an object.
 */
public interface FloatBoolBool2RefFn<R> {
    R invoke(float p1, boolean p2, boolean p3);
}
