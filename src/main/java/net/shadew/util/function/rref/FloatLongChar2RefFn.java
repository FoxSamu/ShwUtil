package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code long} and a {@code char} and returns an object.
 */
public interface FloatLongChar2RefFn<R> {
    R invoke(float p1, long p2, char p3);
}
