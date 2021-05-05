package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int}, a {@code short} and a {@code byte} and returns a {@code double}.
 */
public interface IntShortByte2DoubleFn {
    double invoke(int p1, short p2, byte p3);
}
