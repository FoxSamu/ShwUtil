package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code char} and a {@code float} and returns an object.
 */
public interface FloatCharFloat2RefFn<R> {
    R invoke(float p1, char p2, float p3);
}
