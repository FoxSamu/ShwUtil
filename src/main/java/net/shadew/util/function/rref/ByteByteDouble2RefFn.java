package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code byte} and a {@code double} and returns an object.
 */
public interface ByteByteDouble2RefFn<R> {
    R invoke(byte p1, byte p2, double p3);
}
