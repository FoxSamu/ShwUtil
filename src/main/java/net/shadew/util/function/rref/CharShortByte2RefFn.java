package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code short} and a {@code byte} and returns an object.
 */
public interface CharShortByte2RefFn<R> {
    R invoke(char p1, short p2, byte p3);
}
