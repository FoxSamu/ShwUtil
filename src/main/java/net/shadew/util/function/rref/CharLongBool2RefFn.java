package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code long} and a {@code boolean} and returns an object.
 */
public interface CharLongBool2RefFn<R> {
    R invoke(char p1, long p2, boolean p3);
}
