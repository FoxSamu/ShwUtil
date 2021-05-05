package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code byte}, an object and an {@code int} and returns a {@code double}.
 */
public interface ByteRefInt2DoubleFn<P2> {
    double invoke(byte p1, P2 p2, int p3);
}
