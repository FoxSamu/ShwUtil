package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code char} and a {@code long} and returns an object.
 */
public interface FloatCharLong2RefFn<R> {
    R invoke(float p1, char p2, long p3);
}
