package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code long} and a {@code char} and returns an object.
 */
public interface IntLongChar2RefFn<R> {
    R invoke(int p1, long p2, char p3);
}
