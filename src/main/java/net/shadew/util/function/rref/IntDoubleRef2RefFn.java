package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code double} and an object and returns an object.
 */
public interface IntDoubleRef2RefFn<P3, R> {
    R invoke(int p1, double p2, P3 p3);
}
