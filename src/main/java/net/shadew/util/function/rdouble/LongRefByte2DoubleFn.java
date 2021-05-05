package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, an object and a {@code byte} and returns a {@code double}.
 */
public interface LongRefByte2DoubleFn<P2> {
    double invoke(long p1, P2 p2, byte p3);
}
