package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code float} and an {@code int} and returns an object.
 */
public interface IntFloatInt2RefFn<R> {
    R invoke(int p1, float p2, int p3);
}
