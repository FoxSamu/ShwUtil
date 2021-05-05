package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code float} and a {@code char} and returns an object.
 */
public interface CharFloatChar2RefFn<R> {
    R invoke(char p1, float p2, char p3);
}
