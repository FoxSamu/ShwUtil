package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code long} and an object and returns an object.
 */
public interface FloatLongRef2RefFn<P3, R> {
    R invoke(float p1, long p2, P3 p3);
}
