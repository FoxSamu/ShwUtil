package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code long} and an {@code int} and returns an object.
 */
public interface CharLongInt2RefFn<R> {
    R invoke(char p1, long p2, int p3);
}
