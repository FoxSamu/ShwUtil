package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code double} and a {@code float} and returns an object.
 */
public interface IntDoubleFloat2RefFn<R> {
    R invoke(int p1, double p2, float p3);
}
