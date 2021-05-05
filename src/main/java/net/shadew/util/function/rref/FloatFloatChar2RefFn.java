package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code float} and a {@code char} and returns an object.
 */
public interface FloatFloatChar2RefFn<R> {
    R invoke(float p1, float p2, char p3);
}
