package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char} and a {@code byte} and returns an object.
 */
public interface CharByte2RefFn<R> {
    R invoke(char p1, byte p2);
}
