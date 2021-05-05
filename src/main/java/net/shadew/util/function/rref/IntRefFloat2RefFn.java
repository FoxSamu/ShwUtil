package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, an object and a {@code float} and returns an object.
 */
public interface IntRefFloat2RefFn<P2, R> {
    R invoke(int p1, P2 p2, float p3);
}
