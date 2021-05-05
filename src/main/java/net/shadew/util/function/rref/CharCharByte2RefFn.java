package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code char} and a {@code byte} and returns an object.
 */
public interface CharCharByte2RefFn<R> {
    R invoke(char p1, char p2, byte p3);
}
