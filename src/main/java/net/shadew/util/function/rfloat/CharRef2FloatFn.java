package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code char} and an object and returns a {@code float}.
 */
public interface CharRef2FloatFn<P2> {
    float invoke(char p1, P2 p2);
}
