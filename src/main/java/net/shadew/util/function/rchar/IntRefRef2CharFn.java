package net.shadew.util.function.rchar;

/**
 * A function that takes an {@code int}, an object and an object and returns a {@code char}.
 */
public interface IntRefRef2CharFn<P2, P3> {
    char invoke(int p1, P2 p2, P3 p3);
}
