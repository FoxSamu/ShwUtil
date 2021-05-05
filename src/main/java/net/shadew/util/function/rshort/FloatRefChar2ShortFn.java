package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code float}, an object and a {@code char} and returns a {@code short}.
 */
public interface FloatRefChar2ShortFn<P2> {
    short invoke(float p1, P2 p2, char p3);
}
