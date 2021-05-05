package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code long} and a {@code byte} and returns a {@code double}.
 */
public interface RefLongByte2DoubleFn<P1> {
    double invoke(P1 p1, long p2, byte p3);
}
