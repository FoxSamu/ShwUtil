package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code long} and an {@code int} and returns an object.
 */
public interface BoolLongInt2RefFn<R> {
    R invoke(boolean p1, long p2, int p3);
}
