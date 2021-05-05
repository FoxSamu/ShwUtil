package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double} and a {@code char} and returns an object.
 */
public interface DoubleChar2RefFn<R> {
    R invoke(double p1, char p2);
}
