package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code double} and a {@code short} and returns an object.
 */
public interface ByteDoubleShort2RefFn<R> {
    R invoke(byte p1, double p2, short p3);
}
