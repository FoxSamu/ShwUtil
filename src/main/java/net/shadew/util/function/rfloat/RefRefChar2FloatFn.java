package net.shadew.util.function.rfloat;

/**
 * A function that takes an object, an object and a {@code char} and returns a {@code float}.
 */
public interface RefRefChar2FloatFn<P1, P2> {
    float invoke(P1 p1, P2 p2, char p3);
}
