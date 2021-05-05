package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code char}, an object and an {@code int} and returns a {@code char}.
 */
public interface CharRefInt2CharFn<P2> {
    char invoke(char p1, P2 p2, int p3);
}
