package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code double}, a {@code char} and an object and returns a {@code float}.
 */
public interface DoubleCharRef2FloatFn<P3> {
    float invoke(double p1, char p2, P3 p3);
}
