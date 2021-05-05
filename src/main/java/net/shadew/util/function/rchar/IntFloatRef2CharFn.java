package net.shadew.util.function.rchar;

/**
 * A function that takes an {@code int}, a {@code float} and an object and returns a {@code char}.
 */
public interface IntFloatRef2CharFn<P3> {
    char invoke(int p1, float p2, P3 p3);
}
