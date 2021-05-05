package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code boolean} and a {@code long} and returns an object.
 */
public interface BoolBoolLong2RefFn<R> {
    R invoke(boolean p1, boolean p2, long p3);
}
