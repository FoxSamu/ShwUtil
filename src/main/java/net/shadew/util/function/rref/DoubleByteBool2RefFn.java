package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code byte} and a {@code boolean} and returns an object.
 */
public interface DoubleByteBool2RefFn<R> {
    R invoke(double p1, byte p2, boolean p3);
}
