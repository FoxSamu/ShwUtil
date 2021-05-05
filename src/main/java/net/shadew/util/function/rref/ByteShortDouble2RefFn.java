package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code short} and a {@code double} and returns an object.
 */
public interface ByteShortDouble2RefFn<R> {
    R invoke(byte p1, short p2, double p3);
}
