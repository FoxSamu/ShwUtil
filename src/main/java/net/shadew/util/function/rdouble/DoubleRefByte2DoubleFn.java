package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code double}, an object and a {@code byte} and returns a {@code double}.
 */
public interface DoubleRefByte2DoubleFn<P2> {
    double invoke(double p1, P2 p2, byte p3);
}
