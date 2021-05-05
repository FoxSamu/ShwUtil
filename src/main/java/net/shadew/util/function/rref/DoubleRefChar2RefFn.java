package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, an object and a {@code char} and returns an object.
 */
public interface DoubleRefChar2RefFn<P2, R> {
    R invoke(double p1, P2 p2, char p3);
}
