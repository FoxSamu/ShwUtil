package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code char} and a {@code boolean} and returns an object.
 */
public interface LongCharBool2RefFn<R> {
    R invoke(long p1, char p2, boolean p3);
}
