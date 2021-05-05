package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code double} and a {@code char} and returns an object.
 */
public interface DoubleDoubleChar2RefFn<R> {
    R invoke(double p1, double p2, char p3);
}
