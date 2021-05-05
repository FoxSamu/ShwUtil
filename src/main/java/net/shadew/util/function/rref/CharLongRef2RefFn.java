package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code long} and an object and returns an object.
 */
public interface CharLongRef2RefFn<P3, R> {
    R invoke(char p1, long p2, P3 p3);
}
