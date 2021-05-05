package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code char} and a {@code long} and returns an object.
 */
public interface ShortCharLong2RefFn<R> {
    R invoke(short p1, char p2, long p3);
}
