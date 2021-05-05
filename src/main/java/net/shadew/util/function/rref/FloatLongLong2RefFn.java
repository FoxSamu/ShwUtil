package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code long} and a {@code long} and returns an object.
 */
public interface FloatLongLong2RefFn<R> {
    R invoke(float p1, long p2, long p3);
}
