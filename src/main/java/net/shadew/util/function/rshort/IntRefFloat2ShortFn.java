package net.shadew.util.function.rshort;

/**
 * A function that takes an {@code int}, an object and a {@code float} and returns a {@code short}.
 */
public interface IntRefFloat2ShortFn<P2> {
    short invoke(int p1, P2 p2, float p3);
}
