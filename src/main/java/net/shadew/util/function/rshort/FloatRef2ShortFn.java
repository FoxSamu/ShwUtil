package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code float} and an object and returns a {@code short}.
 */
public interface FloatRef2ShortFn<P2> {
    short invoke(float p1, P2 p2);
}
