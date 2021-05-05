package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double} and an object and returns an object.
 */
public interface DoubleRef2RefFn<P2, R> {
    R invoke(double p1, P2 p2);
}
