package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code double}, an object and a {@code float} and returns a {@code char}.
 */
public interface DoubleRefFloat2CharFn<P2> {
    char invoke(Double p1, P2 p2, Float p3);
}
