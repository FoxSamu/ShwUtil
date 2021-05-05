package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code char} and a {@code double} and returns an object.
 */
public interface DoubleCharDouble2RefFn<R> {
    R invoke(double p1, char p2, double p3);
}
