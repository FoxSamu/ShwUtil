package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code float}, a {@code double} and an object and returns a {@code short}.
 */
public interface FloatDoubleRef2ShortFn<P3> {
    short invoke(float p1, double p2, P3 p3);
}
