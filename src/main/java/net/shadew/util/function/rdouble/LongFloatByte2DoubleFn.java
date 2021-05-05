package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code float} and a {@code byte} and returns a {@code double}.
 */
public interface LongFloatByte2DoubleFn {
    double invoke(long p1, float p2, byte p3);
}
