package net.shadew.util.function.rchar;

/**
 * A function that takes an {@code int}, an object and a {@code boolean} and returns a {@code char}.
 */
public interface IntRefBool2CharFn<P2> {
    char invoke(int p1, P2 p2, boolean p3);
}
