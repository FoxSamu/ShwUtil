package net.shadew.util.function.rchar;

/**
 * A function that takes an {@code int}, an object and a {@code short} and returns a {@code char}.
 */
public interface IntRefShort2CharFn<P2> {
    char invoke(int p1, P2 p2, short p3);
}
