package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int}, a {@code byte} and an object and returns a {@code double}.
 */
public interface IntByteRef2DoubleFn<P3> {
    double invoke(int p1, byte p2, P3 p3);
}
