package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code long} and a {@code short} and returns an object.
 */
public interface CharLongShort2RefFn<R> {
    R invoke(char p1, long p2, short p3);
}
