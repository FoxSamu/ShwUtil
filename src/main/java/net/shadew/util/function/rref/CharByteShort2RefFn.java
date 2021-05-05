package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code byte} and a {@code short} and returns an object.
 */
public interface CharByteShort2RefFn<R> {
    R invoke(char p1, byte p2, short p3);
}
