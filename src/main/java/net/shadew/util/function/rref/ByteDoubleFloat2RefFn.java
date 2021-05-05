package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code double} and a {@code float} and returns an object.
 */
public interface ByteDoubleFloat2RefFn<R> {
    R invoke(byte p1, double p2, float p3);
}
