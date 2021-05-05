package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code float} and a {@code float} and returns an object.
 */
public interface CharFloatFloat2RefFn<R> {
    R invoke(char p1, float p2, float p3);
}
