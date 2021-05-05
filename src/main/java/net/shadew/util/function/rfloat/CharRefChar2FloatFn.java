package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code char}, an object and a {@code char} and returns a {@code float}.
 */
public interface CharRefChar2FloatFn<P2> {
    float invoke(char p1, P2 p2, char p3);
}
