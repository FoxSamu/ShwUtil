package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code boolean}, an object and an {@code int} and returns a {@code char}.
 */
public interface BoolRefInt2CharFn<P2> {
    char invoke(boolean p1, P2 p2, int p3);
}
