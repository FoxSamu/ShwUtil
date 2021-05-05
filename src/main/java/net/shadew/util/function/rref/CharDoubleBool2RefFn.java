package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code double} and a {@code boolean} and returns an object.
 */
public interface CharDoubleBool2RefFn<R> {
    R invoke(char p1, double p2, boolean p3);
}
