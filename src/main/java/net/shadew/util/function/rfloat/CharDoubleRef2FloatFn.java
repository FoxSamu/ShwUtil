package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code char}, a {@code double} and an object and returns a {@code float}.
 */
public interface CharDoubleRef2FloatFn<P3> {
    float invoke(char p1, double p2, P3 p3);
}
