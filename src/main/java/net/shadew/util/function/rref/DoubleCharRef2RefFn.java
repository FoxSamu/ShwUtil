package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code char} and an object and returns an object.
 */
public interface DoubleCharRef2RefFn<P3, R> {
    R invoke(double p1, char p2, P3 p3);
}
