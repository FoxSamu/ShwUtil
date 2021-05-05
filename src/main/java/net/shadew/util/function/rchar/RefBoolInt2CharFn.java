package net.shadew.util.function.rchar;

/**
 * A function that takes an object, a {@code boolean} and an {@code int} and returns a {@code char}.
 */
public interface RefBoolInt2CharFn<P1> {
    char invoke(P1 p1, boolean p2, int p3);
}