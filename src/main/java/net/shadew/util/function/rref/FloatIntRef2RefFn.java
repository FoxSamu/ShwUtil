package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, an {@code int} and an object and returns an object.
 */
public interface FloatIntRef2RefFn<P3, R> {
    R invoke(float p1, int p2, P3 p3);
}
