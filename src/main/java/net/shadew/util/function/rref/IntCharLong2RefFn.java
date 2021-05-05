package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code char} and a {@code long} and returns an object.
 */
public interface IntCharLong2RefFn<R> {
    R invoke(int p1, char p2, long p3);
}
