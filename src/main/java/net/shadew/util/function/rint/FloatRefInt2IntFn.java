package net.shadew.util.function.rint;

/**
 * A function that takes a {@code float}, an object and an {@code int} and returns an {@code int}.
 */
public interface FloatRefInt2IntFn<P2> {
    int invoke(Float p1, P2 p2, Int p3);
}
