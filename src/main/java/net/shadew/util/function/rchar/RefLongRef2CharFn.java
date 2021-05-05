package net.shadew.util.function.rchar;

/**
 * A function that takes an object, a {@code long} and an object and returns a {@code char}.
 */
public interface RefLongRef2CharFn<P1, P3> {
    char invoke(P1 p1, long p2, P3 p3);
}
