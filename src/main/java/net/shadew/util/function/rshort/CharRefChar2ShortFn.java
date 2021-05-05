package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code char}, an object and a {@code char} and returns a {@code short}.
 */
public interface CharRefChar2ShortFn<P2> {
    short invoke(char p1, P2 p2, char p3);
}
