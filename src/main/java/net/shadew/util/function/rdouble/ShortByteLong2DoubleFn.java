package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short}, a {@code byte} and a {@code long} and returns a {@code double}.
 */
public interface ShortByteLong2DoubleFn {
    double invoke(short p1, byte p2, long p3);
}
