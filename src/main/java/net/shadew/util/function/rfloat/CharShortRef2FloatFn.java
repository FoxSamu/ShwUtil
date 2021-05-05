package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code char}, a {@code short} and an object and returns a {@code float}.
 */
public interface CharShortRef2FloatFn<P3> {
    float invoke(char p1, short p2, P3 p3);
}
