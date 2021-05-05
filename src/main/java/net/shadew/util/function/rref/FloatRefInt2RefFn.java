package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, an object and an {@code int} and returns an object.
 */
public interface FloatRefInt2RefFn<P2, R> {
    R invoke(float p1, P2 p2, int p3);
}
