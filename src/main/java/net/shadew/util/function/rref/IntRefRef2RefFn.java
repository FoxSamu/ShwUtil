package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, an object and an object and returns an object.
 */
public interface IntRefRef2RefFn<P2, P3, R> {
    R invoke(int p1, P2 p2, P3 p3);
}
