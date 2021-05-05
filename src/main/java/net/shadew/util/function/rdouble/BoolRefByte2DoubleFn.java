package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code boolean}, an object and a {@code byte} and returns a {@code double}.
 */
public interface BoolRefByte2DoubleFn<P2> {
    double invoke(boolean p1, P2 p2, byte p3);
}
