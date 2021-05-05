package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code short} and a {@code boolean} and returns an object.
 */
public interface IntShortBool2RefFn<R> {
    R invoke(int p1, short p2, boolean p3);
}
