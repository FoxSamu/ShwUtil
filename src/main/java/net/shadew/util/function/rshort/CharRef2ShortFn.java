package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code char} and an object and returns a {@code short}.
 */
public interface CharRef2ShortFn<P2> {
    short invoke(char p1, P2 p2);
}
