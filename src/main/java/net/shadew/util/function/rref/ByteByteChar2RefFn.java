package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code byte} and a {@code char} and returns an object.
 */
public interface ByteByteChar2RefFn<R> {
    R invoke(byte p1, byte p2, char p3);
}
