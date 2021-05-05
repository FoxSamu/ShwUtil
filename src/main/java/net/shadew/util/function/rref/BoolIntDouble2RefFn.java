package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, an {@code int} and a {@code double} and returns an object.
 */
public interface BoolIntDouble2RefFn<R> {
    R invoke(boolean p1, int p2, double p3);
}
