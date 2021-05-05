package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code double} and an {@code int} and returns an object.
 */
public interface BoolDoubleInt2RefFn<R> {
    R invoke(boolean p1, double p2, int p3);
}
