package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code float}, a {@code byte} and an object and returns a {@code double}.
 */
public interface FloatByteRef2DoubleFn<P3> {
    double invoke(float p1, byte p2, P3 p3);
}
