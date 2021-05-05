package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code char} and a {@code double} and returns an object.
 */
public interface FloatCharDouble2RefFn<R> {
    R invoke(float p1, char p2, double p3);
}
