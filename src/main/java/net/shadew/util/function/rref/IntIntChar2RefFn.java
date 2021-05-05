package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, an {@code int} and a {@code char} and returns an object.
 */
public interface IntIntChar2RefFn<R> {
    R invoke(int p1, int p2, char p3);
}
