package net.shadew.util.function.rref;

/**
 * A function that takes a {@code double}, a {@code float} and a {@code byte} and returns an object.
 */
public interface DoubleFloatByte2RefFn<R> {
    R invoke(double p1, float p2, byte p3);
}
