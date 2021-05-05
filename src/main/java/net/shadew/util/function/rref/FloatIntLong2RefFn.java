package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, an {@code int} and a {@code long} and returns an object.
 */
public interface FloatIntLong2RefFn<R> {
    R invoke(float p1, int p2, long p3);
}
