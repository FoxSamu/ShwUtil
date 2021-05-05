package net.shadew.util.function.rshort;

/**
 * A function that takes an object, a {@code double} and an object and returns a {@code short}.
 */
public interface RefDoubleRef2ShortFn<P1, P3> {
    short invoke(P1 p1, double p2, P3 p3);
}
