package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code long} and an object and returns an object.
 */
public interface ShortLongRef2RefFn<P3, R> {
    R invoke(short p1, long p2, P3 p3);
}
