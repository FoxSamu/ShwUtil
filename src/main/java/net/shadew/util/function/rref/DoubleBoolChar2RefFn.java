package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code boolean} and a {@code char} and returns an object.
 */
public interface DoubleBoolChar2RefFn<R> {
    R invoke(double p1, boolean p2, char p3);
}
