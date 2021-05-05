package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code byte} and an object and returns a {@code double}.
 */
public interface RefByteRef2DoubleFn<P1, P3> {
    double invoke(P1 p1, byte p2, P3 p3);
}
