package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code float}, a {@code byte} and a {@code long} and returns a {@code double}.
 */
public interface FloatByteLong2DoubleFn {
    double invoke(float p1, byte p2, long p3);
}
