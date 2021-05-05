package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code char}, a {@code long} and an object and returns a {@code float}.
 */
public interface CharLongRef2FloatFn<P3> {
    float invoke(char p1, long p2, P3 p3);
}
