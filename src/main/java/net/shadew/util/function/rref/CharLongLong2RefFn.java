package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code long} and a {@code long} and returns an object.
 */
public interface CharLongLong2RefFn<R> {
    R invoke(char p1, long p2, long p3);
}
