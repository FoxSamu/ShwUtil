package net.shadew.util.function.rshort;

/**
 * A function that takes an {@code int}, an object and an {@code int} and returns a {@code short}.
 */
public interface IntRefInt2ShortFn<P2> {
    short invoke(int p1, P2 p2, int p3);
}
