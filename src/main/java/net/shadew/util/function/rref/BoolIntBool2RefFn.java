package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, an {@code int} and a {@code boolean} and returns an object.
 */
public interface BoolIntBool2RefFn<R> {
    R invoke(boolean p1, int p2, boolean p3);
}
