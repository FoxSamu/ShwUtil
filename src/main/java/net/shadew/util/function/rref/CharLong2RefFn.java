package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char} and a {@code long} and returns an object.
 */
public interface CharLong2RefFn<R> {
    R invoke(char p1, long p2);
}
