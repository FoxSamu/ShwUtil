package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code boolean} and a {@code long} and returns an object.
 */
public interface FloatBoolLong2RefFn<R> {
    R invoke(float p1, boolean p2, long p3);
}
