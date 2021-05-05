package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code long}, a {@code byte} and a {@code double} and returns a {@code char}.
 */
public interface LongByteDouble2CharFn {
    char invoke(long p1, byte p2, double p3);
}