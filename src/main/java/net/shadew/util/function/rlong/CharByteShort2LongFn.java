package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code char}, a {@code byte} and a {@code short} and returns a {@code long}.
 */
public interface CharByteShort2LongFn {
    long invoke(char p1, byte p2, short p3);
}
