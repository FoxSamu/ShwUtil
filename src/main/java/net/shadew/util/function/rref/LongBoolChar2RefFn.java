package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code boolean} and a {@code char} and returns an object.
 */
public interface LongBoolChar2RefFn<R> {
    R invoke(long p1, boolean p2, char p3);
}
