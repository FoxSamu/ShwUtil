package net.shadew.util.function.rint;

/**
 * A function that takes a {@code float} and an object and returns an {@code int}.
 */
public interface FloatRef2IntFn<P2> {
    int invoke(float p1, P2 p2);
}
