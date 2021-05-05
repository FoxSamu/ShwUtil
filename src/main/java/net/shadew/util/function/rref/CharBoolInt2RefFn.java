package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code boolean} and an {@code int} and returns an object.
 */
public interface CharBoolInt2RefFn<R> {
    R invoke(char p1, boolean p2, int p3);
}
