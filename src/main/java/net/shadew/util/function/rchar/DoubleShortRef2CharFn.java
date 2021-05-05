package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code double}, a {@code short} and an object and returns a {@code char}.
 */
public interface DoubleShortRef2CharFn<P3> {
    char invoke(double p1, short p2, P3 p3);
}
