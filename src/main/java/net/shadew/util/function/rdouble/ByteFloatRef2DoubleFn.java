package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code byte}, a {@code float} and an object and returns a {@code double}.
 */
public interface ByteFloatRef2DoubleFn<P3> {
    double invoke(byte p1, float p2, P3 p3);
}
