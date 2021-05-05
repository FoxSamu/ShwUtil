package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code boolean} and an {@code int} and returns an object.
 */
public interface FloatBoolInt2RefFn<R> {
    R invoke(float p1, boolean p2, int p3);
}
