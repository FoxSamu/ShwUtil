package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code double} and a {@code char} and returns an object.
 */
public interface IntDoubleChar2RefFn<R> {
    R invoke(int p1, double p2, char p3);
}
