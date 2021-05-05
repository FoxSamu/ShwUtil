package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code boolean}, a {@code byte} and an object and returns a {@code double}.
 */
public interface BoolByteRef2DoubleFn<P3> {
    double invoke(boolean p1, byte p2, P3 p3);
}
