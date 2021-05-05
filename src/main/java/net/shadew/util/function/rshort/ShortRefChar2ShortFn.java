package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code short}, an object and a {@code char} and returns a {@code short}.
 */
public interface ShortRefChar2ShortFn<P2> {
    short invoke(short p1, P2 p2, char p3);
}
