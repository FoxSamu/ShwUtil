package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code short}, an object and a {@code char} and returns a {@code float}.
 */
public interface ShortRefChar2FloatFn<P2> {
    float invoke(short p1, P2 p2, char p3);
}
