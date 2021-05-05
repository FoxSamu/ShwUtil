package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code byte}, a {@code long} and a {@code short} and returns a {@code double}.
 */
public interface ByteLongShort2DoubleFn {
    double invoke(byte p1, long p2, short p3);
}
