package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code double} and a {@code boolean} and returns an object.
 */
public interface ShortDoubleBool2RefFn<R> {
    R invoke(short p1, double p2, boolean p3);
}
