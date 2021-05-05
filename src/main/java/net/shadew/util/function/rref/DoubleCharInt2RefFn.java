package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code char} and an {@code int} and returns an object.
 */
public interface DoubleCharInt2RefFn<R> {
    R invoke(double p1, char p2, int p3);
}
