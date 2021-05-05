package net.shadew.util.function.rchar;

/**
 * A function that takes an object, a {@code float} and an object and returns a {@code char}.
 */
public interface RefFloatRef2CharFn<P1, P3> {
    char invoke(P1 p1, float p2, P3 p3);
}
