package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code byte}, a {@code byte} and an object and returns a {@code double}.
 */
public interface ByteByteRef2DoubleFn<P3> {
    double invoke(byte p1, byte p2, P3 p3);
}
