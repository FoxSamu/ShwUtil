package net.shadew.util.function.rdouble;

/**
 * A function that takes an {@code int}, a {@code char} and an object and returns a {@code double}.
 */
public interface IntCharRef2DoubleFn<P3> {
    double invoke(int p1, char p2, P3 p3);
}
