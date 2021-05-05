package net.shadew.util.function.rshort;

/**
 * A function that takes an object, a {@code double} and a {@code long} and returns a {@code short}.
 */
public interface RefDoubleLong2ShortFn<P1> {
    short invoke(P1 p1, Double p2, Long p3);
}
