package net.shadew.util.function.rshort;

/**
 * A function that takes an {@code int} and an object and returns a {@code short}.
 */
public interface IntRef2ShortFn<P2> {
    short invoke(int p1, P2 p2);
}
