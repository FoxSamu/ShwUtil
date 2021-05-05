package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code short}, a {@code double} and an object and returns a {@code char}.
 */
public interface ShortDoubleRef2CharFn<P3> {
    char invoke(short p1, double p2, P3 p3);
}
