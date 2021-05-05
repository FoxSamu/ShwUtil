package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code short}, a {@code byte} and a {@code char} and returns a {@code long}.
 */
public interface ShortByteChar2LongFn {
    long invoke(short p1, byte p2, char p3);
}
