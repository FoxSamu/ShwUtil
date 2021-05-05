package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double} and a {@code long} and returns an object.
 */
public interface DoubleLong2RefFn<R> {
    R invoke(double p1, long p2);
}
