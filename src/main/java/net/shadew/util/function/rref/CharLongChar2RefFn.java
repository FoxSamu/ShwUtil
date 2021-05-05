package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code long} and a {@code char} and returns an object.
 */
public interface CharLongChar2RefFn<R> {
    R invoke(char p1, long p2, char p3);
}
