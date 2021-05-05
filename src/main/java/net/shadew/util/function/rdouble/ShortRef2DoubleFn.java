package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code short} and an object and returns a {@code double}.
 */
public interface ShortRef2DoubleFn<P2> {
    double invoke(short p1, P2 p2);
}
