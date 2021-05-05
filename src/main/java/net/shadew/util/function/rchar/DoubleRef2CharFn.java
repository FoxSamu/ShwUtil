package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code double} and an object and returns a {@code char}.
 */
public interface DoubleRef2CharFn<P2> {
    char invoke(double p1, P2 p2);
}
