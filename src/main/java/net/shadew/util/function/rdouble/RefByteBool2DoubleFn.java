package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code byte} and a {@code boolean} and returns a {@code double}.
 */
public interface RefByteBool2DoubleFn<P1> {
    double invoke(P1 p1, byte p2, boolean p3);
}
