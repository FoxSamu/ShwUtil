package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code float} and an object and returns nothing.
 */
public interface FloatRef2VoidFn<P2> {
    void invoke(float p1, P2 p2);
}
