package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code boolean}, a {@code byte} and a {@code long} and returns a {@code double}.
 */
public interface BoolByteLong2DoubleFn {
    double invoke(boolean p1, byte p2, long p3);
}
