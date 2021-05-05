package net.shadew.util.function.rdouble;

/**
 * A function that takes an object, a {@code char} and a {@code float} and returns a {@code double}.
 */
public interface RefCharFloat2DoubleFn<P1> {
    double invoke(P1 p1, char p2, float p3);
}
