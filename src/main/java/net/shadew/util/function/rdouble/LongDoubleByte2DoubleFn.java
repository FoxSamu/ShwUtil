package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code double} and a {@code byte} and returns a {@code double}.
 */
public interface LongDoubleByte2DoubleFn {
    double invoke(long p1, double p2, byte p3);
}
