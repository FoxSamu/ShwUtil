package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code double} and a {@code byte} and returns an object.
 */
public interface FloatDoubleByte2RefFn<R> {
    R invoke(float p1, double p2, byte p3);
}
