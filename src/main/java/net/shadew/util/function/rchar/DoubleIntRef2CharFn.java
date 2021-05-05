package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code double}, an {@code int} and an object and returns a {@code char}.
 */
public interface DoubleIntRef2CharFn<P3> {
    char invoke(double p1, int p2, P3 p3);
}
