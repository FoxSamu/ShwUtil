package net.shadew.util.function.rchar;

/**
 * A function that takes an object, a {@code long} and a {@code double} and returns a {@code char}.
 */
public interface RefLongDouble2CharFn<P1> {
    char invoke(P1 p1, long p2, double p3);
}
