package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code double} and a {@code double} and returns an object.
 */
public interface CharDoubleDouble2RefFn<R> {
    R invoke(char p1, double p2, double p3);
}
