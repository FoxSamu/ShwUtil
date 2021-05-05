package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char} and a {@code byte} and returns an object.
 */
public interface CharByte2RefFn<R> {
    R invoke(Char p1, Byte p2);
}
