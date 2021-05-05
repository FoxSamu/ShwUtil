package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code float}, an object and a {@code double} and returns a {@code short}.
 */
public interface FloatRefDouble2ShortFn<P2> {
    short invoke(float p1, P2 p2, double p3);
}
