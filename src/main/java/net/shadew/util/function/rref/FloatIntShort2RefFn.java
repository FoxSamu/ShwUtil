package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, an {@code int} and a {@code short} and returns an object.
 */
public interface FloatIntShort2RefFn<R> {
    R invoke(float p1, int p2, short p3);
}
