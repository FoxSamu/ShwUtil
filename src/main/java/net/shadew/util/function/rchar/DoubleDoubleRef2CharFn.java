package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code double}, a {@code double} and an object and returns a {@code char}.
 */
public interface DoubleDoubleRef2CharFn<P3> {
    char invoke(double p1, double p2, P3 p3);
}
