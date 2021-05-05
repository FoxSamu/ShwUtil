package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code short} and a {@code char} and returns an object.
 */
public interface ByteShortChar2RefFn<R> {
    R invoke(byte p1, short p2, char p3);
}
