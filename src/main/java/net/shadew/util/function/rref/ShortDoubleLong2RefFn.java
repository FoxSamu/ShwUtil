package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code double} and a {@code long} and returns an object.
 */
public interface ShortDoubleLong2RefFn<R> {
    R invoke(short p1, double p2, long p3);
}
