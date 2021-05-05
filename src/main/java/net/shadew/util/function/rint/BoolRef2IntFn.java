package net.shadew.util.function.rint;

/**
 * A function that takes a {@code boolean} and an object and returns an {@code int}.
 */
public interface BoolRef2IntFn<P2> {
    int invoke(boolean p1, P2 p2);
}
