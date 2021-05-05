package net.shadew.util.function.rref;

/**
 * A function that takes a {@code long}, a {@code char} and an object and returns an object.
 */
public interface LongCharRef2RefFn<P3, R> {
    R invoke(long p1, char p2, P3 p3);
}
