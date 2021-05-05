package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code long} and a {@code boolean} and returns an object.
 */
public interface FloatLongBool2RefFn<R> {
    R invoke(float p1, long p2, boolean p3);
}
