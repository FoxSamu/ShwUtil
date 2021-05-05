package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code char} and an {@code int} and returns an object.
 */
public interface CharCharInt2RefFn<R> {
    R invoke(char p1, char p2, int p3);
}
