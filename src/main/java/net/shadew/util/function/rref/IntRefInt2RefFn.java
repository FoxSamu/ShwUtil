package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, an object and an {@code int} and returns an object.
 */
public interface IntRefInt2RefFn<P2, R> {
    R invoke(int p1, P2 p2, int p3);
}
