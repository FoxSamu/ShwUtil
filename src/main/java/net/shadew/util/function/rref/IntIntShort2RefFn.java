package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, an {@code int} and a {@code short} and returns an object.
 */
public interface IntIntShort2RefFn<R> {
    R invoke(int p1, int p2, short p3);
}
