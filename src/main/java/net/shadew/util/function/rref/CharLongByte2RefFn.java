package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code long} and a {@code byte} and returns an object.
 */
public interface CharLongByte2RefFn<R> {
    R invoke(char p1, long p2, byte p3);
}
