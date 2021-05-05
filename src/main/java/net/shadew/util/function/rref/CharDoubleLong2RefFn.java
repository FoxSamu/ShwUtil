package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code double} and a {@code long} and returns an object.
 */
public interface CharDoubleLong2RefFn<R> {
    R invoke(char p1, double p2, long p3);
}
