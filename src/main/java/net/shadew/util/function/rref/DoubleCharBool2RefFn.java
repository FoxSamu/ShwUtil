package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code char} and a {@code boolean} and returns an object.
 */
public interface DoubleCharBool2RefFn<R> {
    R invoke(double p1, char p2, boolean p3);
}
