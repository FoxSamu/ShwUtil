package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code short}, an {@code int} and an object and returns a {@code char}.
 */
public interface ShortIntRef2CharFn<P3> {
    char invoke(short p1, int p2, P3 p3);
}
