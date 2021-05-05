package net.shadew.util.function.rfloat;

/**
 * A function that takes an object and a {@code double} and returns a {@code float}.
 */
public interface RefDouble2FloatFn<P1> {
    float invoke(P1 p1, double p2);
}
