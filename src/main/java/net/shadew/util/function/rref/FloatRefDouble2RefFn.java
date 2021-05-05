package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, an object and a {@code double} and returns an object.
 */
public interface FloatRefDouble2RefFn<P2, R> {
    R invoke(float p1, P2 p2, double p3);
}
