package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code short} and a {@code byte} and returns a {@code double}.
 */
public interface LongShortByte2DoubleFn {
    double invoke(long p1, short p2, byte p3);
}
