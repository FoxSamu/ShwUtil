package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code double}, a {@code float} and an object and returns a {@code char}.
 */
public interface DoubleFloatRef2CharFn<P3> {
    char invoke(double p1, float p2, P3 p3);
}
