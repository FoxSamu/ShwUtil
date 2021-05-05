package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, an object and an {@code int} and returns an object.
 */
public interface CharRefInt2RefFn<P2, R> {
    R invoke(char p1, P2 p2, int p3);
}
