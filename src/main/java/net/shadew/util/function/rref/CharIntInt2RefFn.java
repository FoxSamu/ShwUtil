package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, an {@code int} and an {@code int} and returns an object.
 */
public interface CharIntInt2RefFn<R> {
    R invoke(char p1, int p2, int p3);
}
