package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code byte}, a {@code short} and a {@code long} and returns a {@code double}.
 */
public interface ByteShortLong2DoubleFn {
    double invoke(byte p1, short p2, long p3);
}
