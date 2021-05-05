package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code double} and a {@code float} and returns an object.
 */
public interface CharDoubleFloat2RefFn<R> {
    R invoke(char p1, double p2, float p3);
}
