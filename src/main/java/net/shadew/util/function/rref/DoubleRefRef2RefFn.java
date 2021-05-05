package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, an object and an object and returns an object.
 */
public interface DoubleRefRef2RefFn<P2, P3, R> {
    R invoke(double p1, P2 p2, P3 p3);
}
