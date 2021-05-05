package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code char}, a {@code short} and an object and returns a {@code double}.
 */
public interface CharShortRef2DoubleFn<P3> {
    double invoke(char p1, short p2, P3 p3);
}
