package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code double} and a {@code long} and returns an object.
 */
public interface DoubleDoubleLong2RefFn<R> {
    R invoke(double p1, double p2, long p3);
}
