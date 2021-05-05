package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code long} and a {@code char} and returns an object.
 */
public interface ShortLongChar2RefFn<R> {
    R invoke(short p1, long p2, char p3);
}
