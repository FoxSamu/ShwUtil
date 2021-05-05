package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code float} and a {@code boolean} and returns an object.
 */
public interface IntFloatBool2RefFn<R> {
    R invoke(int p1, float p2, boolean p3);
}
