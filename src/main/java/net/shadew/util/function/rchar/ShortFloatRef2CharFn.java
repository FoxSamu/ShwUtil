package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code short}, a {@code float} and an object and returns a {@code char}.
 */
public interface ShortFloatRef2CharFn<P3> {
    char invoke(short p1, float p2, P3 p3);
}
