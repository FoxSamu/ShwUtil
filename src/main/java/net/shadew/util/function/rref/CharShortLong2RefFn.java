package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code short} and a {@code long} and returns an object.
 */
public interface CharShortLong2RefFn<R> {
    R invoke(char p1, short p2, long p3);
}
