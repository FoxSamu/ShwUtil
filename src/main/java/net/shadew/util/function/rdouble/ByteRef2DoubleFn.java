package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code byte} and an object and returns a {@code double}.
 */
public interface ByteRef2DoubleFn<P2> {
    double invoke(byte p1, P2 p2);
}
