package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code boolean} and a {@code float} and returns an object.
 */
public interface DoubleBoolFloat2RefFn<R> {
    R invoke(double p1, boolean p2, float p3);
}
