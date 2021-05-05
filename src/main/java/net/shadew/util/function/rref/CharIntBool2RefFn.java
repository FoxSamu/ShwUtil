package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, an {@code int} and a {@code boolean} and returns an object.
 */
public interface CharIntBool2RefFn<R> {
    R invoke(char p1, int p2, boolean p3);
}
