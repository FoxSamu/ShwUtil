package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code boolean}, a {@code char} and an object and returns a {@code double}.
 */
public interface BoolCharRef2DoubleFn<P3> {
    double invoke(boolean p1, char p2, P3 p3);
}
