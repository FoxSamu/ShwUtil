package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code float} and an {@code int} and returns an object.
 */
public interface CharFloatInt2RefFn<R> {
    R invoke(char p1, float p2, int p3);
}
