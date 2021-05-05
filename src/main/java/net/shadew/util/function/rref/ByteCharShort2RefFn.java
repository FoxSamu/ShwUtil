package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code char} and a {@code short} and returns an object.
 */
public interface ByteCharShort2RefFn<R> {
    R invoke(byte p1, char p2, short p3);
}
