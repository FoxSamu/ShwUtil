package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code double}, an object and an {@code int} and returns a {@code char}.
 */
public interface DoubleRefInt2CharFn<P2> {
    char invoke(double p1, P2 p2, int p3);
}
