package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code float} and an object and returns an object.
 */
public interface FloatFloatRef2RefFn<P3, R> {
    R invoke(float p1, float p2, P3 p3);
}
