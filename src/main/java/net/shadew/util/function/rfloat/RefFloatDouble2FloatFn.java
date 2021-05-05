package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, a {@code float} and a {@code double} and returns a {@code float}.
 */
public interface RefFloatDouble2FloatFn<P1> {
    float invoke(P1 p1, float p2, double p3);
}