package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code byte} and a {@code double} and returns an object.
 */
public interface FloatByteDouble2RefFn<R> {
    R invoke(float p1, byte p2, double p3);
}
