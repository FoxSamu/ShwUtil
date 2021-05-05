package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code char}, a {@code byte} and an object and returns a {@code double}.
 */
public interface CharByteRef2DoubleFn<P3> {
    double invoke(char p1, byte p2, P3 p3);
}
