package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code short}, a {@code byte} and a {@code char} and returns a {@code long}.
 */
public interface ShortByteChar2LongFn {
    long invoke(Short p1, Byte p2, Char p3);
}
