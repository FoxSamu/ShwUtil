package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code byte} and a {@code short} and returns a {@code double}.
 */
public interface LongByteShort2DoubleFn {
    double invoke(long p1, byte p2, short p3);
}
