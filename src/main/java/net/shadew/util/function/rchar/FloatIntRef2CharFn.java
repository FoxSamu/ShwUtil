package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code float}, an {@code int} and an object and returns a {@code char}.
 */
public interface FloatIntRef2CharFn<P3> {
    char invoke(float p1, int p2, P3 p3);
}
