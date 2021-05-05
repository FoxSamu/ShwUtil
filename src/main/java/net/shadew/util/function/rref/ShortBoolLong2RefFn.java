package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code boolean} and a {@code long} and returns an object.
 */
public interface ShortBoolLong2RefFn<R> {
    R invoke(short p1, boolean p2, long p3);
}
