package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code double}, a {@code byte} and an object and returns a {@code double}.
 */
public interface DoubleByteRef2DoubleFn<P3> {
    double invoke(double p1, byte p2, P3 p3);
}
