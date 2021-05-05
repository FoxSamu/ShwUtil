package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, an {@code int} and a {@code double} and returns an object.
 */
public interface CharIntDouble2RefFn<R> {
    R invoke(char p1, int p2, double p3);
}
