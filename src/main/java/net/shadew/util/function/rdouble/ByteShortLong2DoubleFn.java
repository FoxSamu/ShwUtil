package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code byte}, a {@code short} and a {@code long} and returns a {@code double}.
 */
public interface ByteShortLong2DoubleFn {
    double invoke(Byte p1, Short p2, Long p3);
}
