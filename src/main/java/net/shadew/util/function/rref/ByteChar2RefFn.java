package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte} and a {@code char} and returns an object.
 */
public interface ByteChar2RefFn<R> {
    R invoke(byte p1, char p2);
}