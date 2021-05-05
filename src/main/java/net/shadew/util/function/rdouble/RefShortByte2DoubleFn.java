package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code short} and a {@code byte} and returns a {@code double}.
 */
public interface RefShortByte2DoubleFn<P1> {
    double invoke(P1 p1, short p2, byte p3);
}