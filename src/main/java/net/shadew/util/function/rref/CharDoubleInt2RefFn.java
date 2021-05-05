package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code double} and an {@code int} and returns an object.
 */
public interface CharDoubleInt2RefFn<R> {
    R invoke(char p1, double p2, int p3);
}
