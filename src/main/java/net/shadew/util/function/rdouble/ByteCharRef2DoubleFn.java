package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code byte}, a {@code char} and an object and returns a {@code double}.
 */
public interface ByteCharRef2DoubleFn<P3> {
    double invoke(byte p1, char p2, P3 p3);
}
