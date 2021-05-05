package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, an {@code int} and an {@code int} and returns an object.
 */
public interface FloatIntInt2RefFn<R> {
    R invoke(float p1, int p2, int p3);
}
