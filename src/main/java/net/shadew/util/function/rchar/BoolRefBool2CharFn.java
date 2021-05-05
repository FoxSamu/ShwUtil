package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code boolean}, an object and a {@code boolean} and returns a {@code char}.
 */
public interface BoolRefBool2CharFn<P2> {
    char invoke(boolean p1, P2 p2, boolean p3);
}
