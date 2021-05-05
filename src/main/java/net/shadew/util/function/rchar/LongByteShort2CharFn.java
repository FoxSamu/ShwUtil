package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code long}, a {@code byte} and a {@code short} and returns a {@code char}.
 */
public interface LongByteShort2CharFn {
    char invoke(long p1, byte p2, short p3);
}