package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code char}, a {@code byte} and an {@code int} and returns a {@code long}.
 */
public interface CharByteInt2LongFn {
    long invoke(char p1, byte p2, int p3);
}