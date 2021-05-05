package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code long}, a {@code char} and an object and returns a {@code float}.
 */
public interface LongCharRef2FloatFn<P3> {
    float invoke(long p1, char p2, P3 p3);
}
