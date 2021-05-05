package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code long} and a {@code boolean} and returns an object.
 */
public interface BoolLongBool2RefFn<R> {
    R invoke(boolean p1, long p2, boolean p3);
}
