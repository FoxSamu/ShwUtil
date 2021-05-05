package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code char}, a {@code byte} and a {@code float} and returns a {@code double}.
 */
public interface CharByteFloat2DoubleFn {
    double invoke(char p1, byte p2, float p3);
}