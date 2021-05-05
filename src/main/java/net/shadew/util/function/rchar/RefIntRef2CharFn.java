package net.shadew.util.function.rchar;

/**
 * A function that takes an object, an {@code int} and an object and returns a {@code char}.
 */
public interface RefIntRef2CharFn<P1, P3> {
    char invoke(P1 p1, int p2, P3 p3);
}
