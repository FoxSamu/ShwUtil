package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code short} and an {@code int} and returns an object.
 */
public interface FloatShortInt2RefFn<R> {
    R invoke(float p1, short p2, int p3);
}
