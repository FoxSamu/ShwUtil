package net.shadew.util.function.rdouble;

/**
 * A function that takes a {@code float}, a {@code short} and an object and returns a {@code double}.
 */
public interface FloatShortRef2DoubleFn<P3> {
    double invoke(float p1, short p2, P3 p3);
}
