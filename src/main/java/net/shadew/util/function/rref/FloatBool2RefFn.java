package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float} and a {@code boolean} and returns an object.
 */
public interface FloatBool2RefFn<R> {
    R invoke(float p1, boolean p2);
}
