package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code byte}, an {@code int} and an object and returns a {@code double}.
 */
public interface ByteIntRef2DoubleFn<P3> {
    double invoke(byte p1, int p2, P3 p3);
}
