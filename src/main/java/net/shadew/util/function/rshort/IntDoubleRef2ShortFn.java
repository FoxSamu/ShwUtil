package net.shadew.util.function.rshort;

/**
 * A function that takes an {@code int}, a {@code double} and an object and returns a {@code short}.
 */
public interface IntDoubleRef2ShortFn<P3> {
    short invoke(int p1, double p2, P3 p3);
}
