package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float} and an {@code int} and returns an object.
 */
public interface FloatInt2RefFn<R> {
    R invoke(float p1, int p2);
}
