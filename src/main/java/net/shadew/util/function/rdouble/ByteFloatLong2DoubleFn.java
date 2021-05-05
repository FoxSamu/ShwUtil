package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code byte}, a {@code float} and a {@code long} and returns a {@code double}.
 */
public interface ByteFloatLong2DoubleFn {
    double invoke(byte p1, float p2, long p3);
}
