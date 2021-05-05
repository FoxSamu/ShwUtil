package net.shadew.util.function.rchar;

/**
 * A function that takes an {@code int}, an object and an {@code int} and returns a {@code char}.
 */
public interface IntRefInt2CharFn<P2> {
    char invoke(int p1, P2 p2, int p3);
}
