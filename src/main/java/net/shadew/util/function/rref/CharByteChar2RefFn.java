package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code byte} and a {@code char} and returns an object.
 */
public interface CharByteChar2RefFn<R> {
    R invoke(char p1, byte p2, char p3);
}
