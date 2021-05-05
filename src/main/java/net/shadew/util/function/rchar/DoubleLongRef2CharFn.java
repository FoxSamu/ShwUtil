package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code double}, a {@code long} and an object and returns a {@code char}.
 */
public interface DoubleLongRef2CharFn<P3> {
    char invoke(double p1, long p2, P3 p3);
}
