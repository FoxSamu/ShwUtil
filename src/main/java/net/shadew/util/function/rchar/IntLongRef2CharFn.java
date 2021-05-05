package net.shadew.util.function.rchar;

/**
 * A function that takes an {@code int}, a {@code long} and an object and returns a {@code char}.
 */
public interface IntLongRef2CharFn<P3> {
    char invoke(int p1, long p2, P3 p3);
}
