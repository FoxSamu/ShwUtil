package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code byte}, an object and a {@code long} and returns a {@code double}.
 */
public interface ByteRefLong2DoubleFn<P2> {
    double invoke(byte p1, P2 p2, long p3);
}
