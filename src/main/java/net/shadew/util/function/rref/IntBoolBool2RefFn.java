package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code boolean} and a {@code boolean} and returns an object.
 */
public interface IntBoolBool2RefFn<R> {
    R invoke(int p1, boolean p2, boolean p3);
}
