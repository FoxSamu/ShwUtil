package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, a {@code char} and a {@code double} and returns a {@code float}.
 */
public interface RefCharDouble2FloatFn<P1> {
    float invoke(P1 p1, char p2, double p3);
}
