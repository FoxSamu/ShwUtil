package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code boolean} and an object and returns a {@code short}.
 */
public interface BoolRef2ShortFn<P2> {
    short invoke(boolean p1, P2 p2);
}
