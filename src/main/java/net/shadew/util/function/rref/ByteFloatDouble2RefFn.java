package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code float} and a {@code double} and returns an object.
 */
public interface ByteFloatDouble2RefFn<R> {
    R invoke(byte p1, float p2, double p3);
}
