package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code boolean}, an object and a {@code double} and returns a {@code short}.
 */
public interface BoolRefDouble2ShortFn<P2> {
    short invoke(Bool p1, P2 p2, Double p3);
}
