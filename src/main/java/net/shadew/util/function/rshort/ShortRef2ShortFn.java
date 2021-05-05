package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code short} and an object and returns a {@code short}.
 */
public interface ShortRef2ShortFn<P2> {
    short invoke(short p1, P2 p2);
}
