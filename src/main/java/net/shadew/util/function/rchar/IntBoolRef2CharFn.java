package net.shadew.util.function.rchar;

/**
 * A function that takes an {@code int}, a {@code boolean} and an object and returns a {@code char}.
 */
public interface IntBoolRef2CharFn<P3> {
    char invoke(int p1, boolean p2, P3 p3);
}
