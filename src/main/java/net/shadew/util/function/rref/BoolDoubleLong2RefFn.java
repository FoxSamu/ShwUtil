package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code double} and a {@code long} and returns an object.
 */
public interface BoolDoubleLong2RefFn<R> {
    R invoke(boolean p1, double p2, long p3);
}
