package net.shadew.util.function.rfloat;

/**
 * A function that takes an {@code int}, an object and a {@code char} and returns a {@code float}.
 */
public interface IntRefChar2FloatFn<P2> {
    float invoke(int p1, P2 p2, char p3);
}
