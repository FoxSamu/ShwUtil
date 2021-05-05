package net.shadew.util.function.rchar;

/**
 * A function that takes an object, a {@code short} and an {@code int} and returns a {@code char}.
 */
public interface RefShortInt2CharFn<P1> {
    char invoke(P1 p1, short p2, int p3);
}
