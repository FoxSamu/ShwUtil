package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code float} and a {@code char} and returns an object.
 */
public interface IntFloatChar2RefFn<R> {
    R invoke(int p1, float p2, char p3);
}
