package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int} and a {@code double} and returns an object.
 */
public interface IntDouble2RefFn<R> {
    R invoke(int p1, double p2);
}
