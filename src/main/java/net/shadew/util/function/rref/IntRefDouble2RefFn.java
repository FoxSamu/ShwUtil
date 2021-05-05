package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, an object and a {@code double} and returns an object.
 */
public interface IntRefDouble2RefFn<P2, R> {
    R invoke(int p1, P2 p2, double p3);
}
