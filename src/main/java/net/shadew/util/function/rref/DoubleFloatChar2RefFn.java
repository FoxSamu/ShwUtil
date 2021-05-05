package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code float} and a {@code char} and returns an object.
 */
public interface DoubleFloatChar2RefFn<R> {
    R invoke(double p1, float p2, char p3);
}
