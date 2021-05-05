package net.shadew.util.function.rshort;

/**
 * A function that takes an {@code int}, a {@code float} and an object and returns a {@code short}.
 */
public interface IntFloatRef2ShortFn<P3> {
    short invoke(int p1, float p2, P3 p3);
}
