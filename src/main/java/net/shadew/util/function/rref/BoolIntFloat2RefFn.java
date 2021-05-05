package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, an {@code int} and a {@code float} and returns an object.
 */
public interface BoolIntFloat2RefFn<R> {
    R invoke(boolean p1, int p2, float p3);
}
