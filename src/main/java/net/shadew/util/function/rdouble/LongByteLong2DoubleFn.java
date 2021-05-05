package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code byte} and a {@code long} and returns a {@code double}.
 */
public interface LongByteLong2DoubleFn {
    double invoke(long p1, byte p2, long p3);
}