package net.shadew.util.function.rchar;

/**
 * A function that takes an object and an {@code int} and returns a {@code char}.
 */
public interface RefInt2CharFn<P1> {
    char invoke(P1 p1, int p2);
}
