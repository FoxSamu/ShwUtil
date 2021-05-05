package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code double}, an object and a {@code double} and returns a {@code char}.
 */
public interface DoubleRefDouble2CharFn<P2> {
    char invoke(double p1, P2 p2, double p3);
}
