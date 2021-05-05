package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code boolean} and an {@code int} and returns an object.
 */
public interface BoolBoolInt2RefFn<R> {
    R invoke(boolean p1, boolean p2, int p3);
}
