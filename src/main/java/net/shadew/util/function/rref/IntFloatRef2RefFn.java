package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code float} and an object and returns an object.
 */
public interface IntFloatRef2RefFn<P3, R> {
    R invoke(int p1, float p2, P3 p3);
}
