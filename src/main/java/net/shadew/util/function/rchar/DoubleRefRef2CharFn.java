package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code double}, an object and an object and returns a {@code char}.
 */
public interface DoubleRefRef2CharFn<P2, P3> {
    char invoke(double p1, P2 p2, P3 p3);
}
