package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char} and an {@code int} and returns an object.
 */
public interface CharInt2RefFn<R> {
    R invoke(char p1, int p2);
}
