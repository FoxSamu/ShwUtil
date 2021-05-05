package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code byte}, a {@code short} and a {@code float} and returns a {@code double}.
 */
public interface ByteShortFloat2DoubleFn {
    double invoke(byte p1, short p2, float p3);
}
