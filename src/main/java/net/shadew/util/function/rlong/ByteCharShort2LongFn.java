package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code byte}, a {@code char} and a {@code short} and returns a {@code long}.
 */
public interface ByteCharShort2LongFn {
    long invoke(byte p1, char p2, short p3);
}
