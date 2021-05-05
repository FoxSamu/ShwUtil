package net.shadew.util.function.rshort;

/**
 * A function that takes an {@code int}, an object and a {@code double} and returns a {@code short}.
 */
public interface IntRefDouble2ShortFn<P2> {
    short invoke(int p1, P2 p2, double p3);
}
