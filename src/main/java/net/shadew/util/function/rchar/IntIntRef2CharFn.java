package net.shadew.util.function.rchar;

/**
 * A function that takes an {@code int}, an {@code int} and an object and returns a {@code char}.
 */
public interface IntIntRef2CharFn<P3> {
    char invoke(int p1, int p2, P3 p3);
}
