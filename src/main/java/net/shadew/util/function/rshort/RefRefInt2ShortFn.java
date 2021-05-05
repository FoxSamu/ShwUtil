package net.shadew.util.function.rshort;

/**
 * A function that takes an object, an object and an {@code int} and returns a {@code short}.
 */
public interface RefRefInt2ShortFn<P1, P2> {
    short invoke(P1 p1, P2 p2, int p3);
}
