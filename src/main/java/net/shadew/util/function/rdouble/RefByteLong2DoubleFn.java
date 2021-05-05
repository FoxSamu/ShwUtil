package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code byte} and a {@code long} and returns a {@code double}.
 */
public interface RefByteLong2DoubleFn<P1> {
    double invoke(P1 p1, Byte p2, Long p3);
}
