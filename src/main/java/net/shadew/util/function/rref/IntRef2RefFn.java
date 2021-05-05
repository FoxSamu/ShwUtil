package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int} and an object and returns an object.
 */
public interface IntRef2RefFn<P2, R> {
    R invoke(int p1, P2 p2);
}
