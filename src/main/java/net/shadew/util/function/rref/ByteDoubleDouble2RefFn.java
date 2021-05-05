package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code double} and a {@code double} and returns an object.
 */
public interface ByteDoubleDouble2RefFn<R> {
    R invoke(byte p1, double p2, double p3);
}
