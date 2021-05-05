package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code short}, an object and an {@code int} and returns a {@code char}.
 */
public interface ShortRefInt2CharFn<P2> {
    char invoke(short p1, P2 p2, int p3);
}
