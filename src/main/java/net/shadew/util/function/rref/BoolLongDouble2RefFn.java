package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code long} and a {@code double} and returns an object.
 */
public interface BoolLongDouble2RefFn<R> {
    R invoke(boolean p1, long p2, double p3);
}
