package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code long} and a {@code short} and returns an object.
 */
public interface FloatLongShort2RefFn<R> {
    R invoke(float p1, long p2, short p3);
}
