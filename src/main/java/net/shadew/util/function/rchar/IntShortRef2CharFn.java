package net.shadew.util.function.rchar;

/**
 * A function that takes an {@code int}, a {@code short} and an object and returns a {@code char}.
 */
public interface IntShortRef2CharFn<P3> {
    char invoke(int p1, short p2, P3 p3);
}
