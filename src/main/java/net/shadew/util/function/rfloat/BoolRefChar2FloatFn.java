package net.shadew.util.function.rfloat;

/**
 * A function that takes a {@code boolean}, an object and a {@code char} and returns a {@code float}.
 */
public interface BoolRefChar2FloatFn<P2> {
    float invoke(boolean p1, P2 p2, char p3);
}
