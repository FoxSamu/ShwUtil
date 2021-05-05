package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code boolean} and a {@code long} and returns an object.
 */
public interface CharBoolLong2RefFn<R> {
    R invoke(char p1, boolean p2, long p3);
}
