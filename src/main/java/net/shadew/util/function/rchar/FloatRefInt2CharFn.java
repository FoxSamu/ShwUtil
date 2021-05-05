package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code float}, an object and an {@code int} and returns a {@code char}.
 */
public interface FloatRefInt2CharFn<P2> {
    char invoke(float p1, P2 p2, int p3);
}
