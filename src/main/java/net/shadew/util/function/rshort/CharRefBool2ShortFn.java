package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code char}, an object and a {@code boolean} and returns a {@code short}.
 */
public interface CharRefBool2ShortFn<P2> {
    short invoke(char p1, P2 p2, boolean p3);
}
