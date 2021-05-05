package net.shadew.util.function.rchar;

/**
 * A function that takes an object, a {@code char} and an {@code int} and returns a {@code char}.
 */
public interface RefCharInt2CharFn<P1> {
    char invoke(P1 p1, char p2, int p3);
}
