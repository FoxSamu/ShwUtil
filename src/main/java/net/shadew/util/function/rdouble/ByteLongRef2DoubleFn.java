package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code byte}, a {@code long} and an object and returns a {@code double}.
 */
public interface ByteLongRef2DoubleFn<P3> {
    double invoke(byte p1, long p2, P3 p3);
}
