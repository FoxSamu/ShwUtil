package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, an {@code int} and an object and returns an object.
 */
public interface BoolIntRef2RefFn<P3, R> {
    R invoke(boolean p1, int p2, P3 p3);
}
