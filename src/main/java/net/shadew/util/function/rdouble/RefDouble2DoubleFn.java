package net.shadew.util.function.rdouble;

/**
 * A function that takes an object and a {@code double} and returns a {@code double}.
 */
public interface RefDouble2DoubleFn<P1> {
    double invoke(P1 p1, double p2);
}
