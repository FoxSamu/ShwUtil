package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code float} and a {@code long} and returns an object.
 */
public interface CharFloatLong2RefFn<R> {
    R invoke(char p1, float p2, long p3);
}
