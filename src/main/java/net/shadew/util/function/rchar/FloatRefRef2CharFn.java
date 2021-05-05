package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code float}, an object and an object and returns a {@code char}.
 */
public interface FloatRefRef2CharFn<P2, P3> {
    char invoke(float p1, P2 p2, P3 p3);
}
