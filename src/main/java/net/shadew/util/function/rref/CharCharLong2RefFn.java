package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code char} and a {@code long} and returns an object.
 */
public interface CharCharLong2RefFn<R> {
    R invoke(char p1, char p2, long p3);
}
