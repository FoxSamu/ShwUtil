package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code float}, a {@code short} and a {@code byte} and returns a {@code double}.
 */
public interface FloatShortByte2DoubleFn {
    double invoke(float p1, short p2, byte p3);
}
