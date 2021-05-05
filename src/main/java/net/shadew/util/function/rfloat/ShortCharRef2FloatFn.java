package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code short}, a {@code char} and an object and returns a {@code float}.
 */
public interface ShortCharRef2FloatFn<P3> {
    float invoke(short p1, char p2, P3 p3);
}
