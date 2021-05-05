package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code float} and a {@code double} and returns an object.
 */
public interface CharFloatDouble2RefFn<R> {
    R invoke(char p1, float p2, double p3);
}
