package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int}, an object and a {@code byte} and returns a {@code double}.
 */
public interface IntRefByte2DoubleFn<P2> {
    double invoke(int p1, P2 p2, byte p3);
}
