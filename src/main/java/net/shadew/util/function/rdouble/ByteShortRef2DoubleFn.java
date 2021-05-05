package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code byte}, a {@code short} and an object and returns a {@code double}.
 */
public interface ByteShortRef2DoubleFn<P3> {
    double invoke(byte p1, short p2, P3 p3);
}
