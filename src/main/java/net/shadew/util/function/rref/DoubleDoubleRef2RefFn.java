package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code double} and an object and returns an object.
 */
public interface DoubleDoubleRef2RefFn<P3, R> {
    R invoke(double p1, double p2, P3 p3);
}
