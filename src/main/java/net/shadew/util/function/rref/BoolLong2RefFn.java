package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean} and a {@code long} and returns an object.
 */
public interface BoolLong2RefFn<R> {
    R invoke(boolean p1, long p2);
}
