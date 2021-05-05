package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code double}, a {@code boolean} and an object and returns a {@code char}.
 */
public interface DoubleBoolRef2CharFn<P3> {
    char invoke(double p1, boolean p2, P3 p3);
}
