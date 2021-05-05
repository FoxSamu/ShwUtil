package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code double} and a {@code float} and returns an object.
 */
public interface RefDoubleFloat2RefFn<P1, R> {
    R invoke(P1 p1, double p2, float p3);
}
