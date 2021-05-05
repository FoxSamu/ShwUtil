package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code float} and an object and returns an object.
 */
public interface CharFloatRef2RefFn<P3, R> {
    R invoke(char p1, float p2, P3 p3);
}
