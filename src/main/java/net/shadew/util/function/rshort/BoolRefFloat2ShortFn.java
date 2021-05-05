package net.shadew.util.function.rshort;

/**
 * A function that takes a {@code boolean}, an object and a {@code float} and returns a {@code short}.
 */
public interface BoolRefFloat2ShortFn<P2> {
    short invoke(boolean p1, P2 p2, float p3);
}
