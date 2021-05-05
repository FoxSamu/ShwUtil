package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, an {@code int} and a {@code float} and returns an object.
 */
public interface FloatIntFloat2RefFn<R> {
    R invoke(float p1, int p2, float p3);
}
