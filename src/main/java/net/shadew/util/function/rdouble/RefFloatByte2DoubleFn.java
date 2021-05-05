package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code float} and a {@code byte} and returns a {@code double}.
 */
public interface RefFloatByte2DoubleFn<P1> {
    double invoke(P1 p1, float p2, byte p3);
}
