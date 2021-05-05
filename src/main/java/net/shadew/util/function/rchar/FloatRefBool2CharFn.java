package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code float}, an object and a {@code boolean} and returns a {@code char}.
 */
public interface FloatRefBool2CharFn<P2> {
    char invoke(float p1, P2 p2, boolean p3);
}
