package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, an {@code int} and a {@code char} and returns an object.
 */
public interface ShortIntChar2RefFn<R> {
    R invoke(short p1, int p2, char p3);
}
