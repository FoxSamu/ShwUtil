package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code long} and an {@code int} and returns an object.
 */
public interface FloatLongInt2RefFn<R> {
    R invoke(float p1, long p2, int p3);
}
