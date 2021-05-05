package net.shadew.util.function.rchar;

/**
 * A function that takes an {@code int} and an object and returns a {@code char}.
 */
public interface IntRef2CharFn<P2> {
    char invoke(int p1, P2 p2);
}
