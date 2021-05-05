package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code long}, a {@code short} and a {@code byte} and returns a {@code char}.
 */
public interface LongShortByte2CharFn {
    char invoke(long p1, short p2, byte p3);
}
