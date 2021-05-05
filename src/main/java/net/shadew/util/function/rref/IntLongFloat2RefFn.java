package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code long} and a {@code float} and returns an object.
 */
public interface IntLongFloat2RefFn<R> {
    R invoke(int p1, long p2, float p3);
}
