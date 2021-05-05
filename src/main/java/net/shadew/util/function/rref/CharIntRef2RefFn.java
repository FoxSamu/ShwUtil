package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, an {@code int} and an object and returns an object.
 */
public interface CharIntRef2RefFn<P3, R> {
    R invoke(char p1, int p2, P3 p3);
}
