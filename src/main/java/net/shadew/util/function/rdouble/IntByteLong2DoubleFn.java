package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int}, a {@code byte} and a {@code long} and returns a {@code double}.
 */
public interface IntByteLong2DoubleFn {
    double invoke(int p1, byte p2, long p3);
}
