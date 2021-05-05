package net.shadew.util.function.rshort;

/**
 * A function that takes an object, a {@code char} and an object and returns a {@code short}.
 */
public interface RefCharRef2ShortFn<P1, P3> {
    short invoke(P1 p1, char p2, P3 p3);
}
