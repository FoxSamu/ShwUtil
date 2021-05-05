package net.shadew.util.function.rchar;

/**
 * A function that takes an object, an {@code int} and a {@code boolean} and returns a {@code char}.
 */
public interface RefIntBool2CharFn<P1> {
    char invoke(P1 p1, int p2, boolean p3);
}
