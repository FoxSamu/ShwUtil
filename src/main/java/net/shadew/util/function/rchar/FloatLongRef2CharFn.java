package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code float}, a {@code long} and an object and returns a {@code char}.
 */
public interface FloatLongRef2CharFn<P3> {
    char invoke(float p1, long p2, P3 p3);
}
