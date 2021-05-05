package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, an {@code int} and a {@code boolean} and returns an object.
 */
public interface FloatIntBool2RefFn<R> {
    R invoke(float p1, int p2, boolean p3);
}
