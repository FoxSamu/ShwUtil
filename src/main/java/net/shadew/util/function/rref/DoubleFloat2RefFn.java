package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double} and a {@code float} and returns an object.
 */
public interface DoubleFloat2RefFn<R> {
    R invoke(double p1, float p2);
}
