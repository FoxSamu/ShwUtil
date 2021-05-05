package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code char} and a {@code short} and returns an object.
 */
public interface ShortCharShort2RefFn<R> {
    R invoke(short p1, char p2, short p3);
}
