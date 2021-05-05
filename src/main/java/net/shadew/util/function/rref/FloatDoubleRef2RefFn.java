package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code double} and an object and returns an object.
 */
public interface FloatDoubleRef2RefFn<P3, R> {
    R invoke(float p1, double p2, P3 p3);
}
