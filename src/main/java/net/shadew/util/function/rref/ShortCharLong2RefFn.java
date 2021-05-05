package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code char} and a {@code long} and returns an object.
 */
public interface ShortCharLong2RefFn<R> {
    R invoke(Short p1, Char p2, Long p3);
}
