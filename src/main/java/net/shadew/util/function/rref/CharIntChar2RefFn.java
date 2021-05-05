package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, an {@code int} and a {@code char} and returns an object.
 */
public interface CharIntChar2RefFn<R> {
    R invoke(char p1, int p2, char p3);
}
