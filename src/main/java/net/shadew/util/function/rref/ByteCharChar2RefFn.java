package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code char} and a {@code char} and returns an object.
 */
public interface ByteCharChar2RefFn<R> {
    R invoke(byte p1, char p2, char p3);
}
