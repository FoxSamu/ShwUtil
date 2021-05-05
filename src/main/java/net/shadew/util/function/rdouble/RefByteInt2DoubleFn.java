package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code byte} and an {@code int} and returns a {@code double}.
 */
public interface RefByteInt2DoubleFn<P1> {
    double invoke(P1 p1, byte p2, int p3);
}
