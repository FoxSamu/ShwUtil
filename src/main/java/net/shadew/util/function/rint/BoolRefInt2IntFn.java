package net.shadew.util.function.rint;

/**
 * A function that takes a {@code boolean}, an object and an {@code int} and returns an {@code int}.
 */
public interface BoolRefInt2IntFn<P2> {
    int invoke(Bool p1, P2 p2, Int p3);
}
