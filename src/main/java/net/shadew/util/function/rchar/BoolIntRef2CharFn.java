package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code boolean}, an {@code int} and an object and returns a {@code char}.
 */
public interface BoolIntRef2CharFn<P3> {
    char invoke(boolean p1, int p2, P3 p3);
}
