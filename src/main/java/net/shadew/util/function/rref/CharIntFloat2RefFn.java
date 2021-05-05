package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, an {@code int} and a {@code float} and returns an object.
 */
public interface CharIntFloat2RefFn<R> {
    R invoke(char p1, int p2, float p3);
}
