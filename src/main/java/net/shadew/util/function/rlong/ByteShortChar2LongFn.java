package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code byte}, a {@code short} and a {@code char} and returns a {@code long}.
 */
public interface ByteShortChar2LongFn {
    long invoke(byte p1, short p2, char p3);
}
