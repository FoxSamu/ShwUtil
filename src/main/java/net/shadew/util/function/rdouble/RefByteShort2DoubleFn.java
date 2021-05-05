package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code byte} and a {@code short} and returns a {@code double}.
 */
public interface RefByteShort2DoubleFn<P1> {
    double invoke(P1 p1, byte p2, short p3);
}
