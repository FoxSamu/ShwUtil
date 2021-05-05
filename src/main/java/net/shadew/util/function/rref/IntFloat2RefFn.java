package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int} and a {@code float} and returns an object.
 */
public interface IntFloat2RefFn<R> {
    R invoke(int p1, float p2);
}