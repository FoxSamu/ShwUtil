package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code byte}, an object and a {@code boolean} and returns a {@code double}.
 */
public interface ByteRefBool2DoubleFn<P2> {
    double invoke(byte p1, P2 p2, boolean p3);
}
