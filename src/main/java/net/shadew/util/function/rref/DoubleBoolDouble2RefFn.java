package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code boolean} and a {@code double} and returns an object.
 */
public interface DoubleBoolDouble2RefFn<R> {
    R invoke(double p1, boolean p2, double p3);
}
