package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, an object and an {@code int} and returns an object.
 */
public interface BoolRefInt2RefFn<P2, R> {
    R invoke(boolean p1, P2 p2, int p3);
}
