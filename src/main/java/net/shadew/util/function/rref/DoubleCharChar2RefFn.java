package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code char} and a {@code char} and returns an object.
 */
public interface DoubleCharChar2RefFn<R> {
    R invoke(double p1, char p2, char p3);
}
