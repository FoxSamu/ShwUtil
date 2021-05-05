package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short}, a {@code byte} and an object and returns a {@code double}.
 */
public interface ShortByteRef2DoubleFn<P3> {
    double invoke(short p1, byte p2, P3 p3);
}
