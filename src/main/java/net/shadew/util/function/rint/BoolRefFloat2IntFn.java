package net.shadew.util.function.rint;

/**
 * A function that takes a {@code boolean}, an object and a {@code float} and returns an {@code int}.
 */
public interface BoolRefFloat2IntFn<P2> {
    int invoke(boolean p1, P2 p2, float p3);
}
