package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code double} and a {@code char} and returns an object.
 */
public interface FloatDoubleChar2RefFn<R> {
    R invoke(float p1, double p2, char p3);
}
