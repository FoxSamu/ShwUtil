package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code long}, a {@code byte} and an object and returns a {@code double}.
 */
public interface LongByteRef2DoubleFn<P3> {
    double invoke(long p1, byte p2, P3 p3);
}
