package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, an {@code int} and a {@code double} and returns an object.
 */
public interface FloatIntDouble2RefFn<R> {
    R invoke(float p1, int p2, double p3);
}
