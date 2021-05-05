package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code boolean} and an object and returns an object.
 */
public interface DoubleBoolRef2RefFn<P3, R> {
    R invoke(double p1, boolean p2, P3 p3);
}
