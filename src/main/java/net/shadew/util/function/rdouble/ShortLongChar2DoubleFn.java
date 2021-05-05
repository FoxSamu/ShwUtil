package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short}, a {@code long} and a {@code char} and returns a {@code double}.
 */
public interface ShortLongChar2DoubleFn {
    double invoke(Short p1, Long p2, Char p3);
}
