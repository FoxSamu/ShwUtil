package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code char} and a {@code byte} and returns an object.
 */
public interface ByteCharByte2RefFn<R> {
    R invoke(byte p1, char p2, byte p3);
}
