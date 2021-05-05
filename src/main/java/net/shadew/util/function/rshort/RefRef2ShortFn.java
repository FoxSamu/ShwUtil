package net.shadew.util.function.rshort;

/**
 * A function that takes an object and an object and returns a {@code short}.
 */
public interface RefRef2ShortFn<P1, P2> {
    short invoke(P1 p1, P2 p2);
}
