package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code char} and a {@code float} and returns an object.
 */
public interface DoubleCharFloat2RefFn<R> {
    R invoke(double p1, char p2, float p3);
}
