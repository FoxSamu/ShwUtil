package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code byte} and a {@code float} and returns an object.
 */
public interface DoubleByteFloat2RefFn<R> {
    R invoke(double p1, byte p2, float p3);
}
