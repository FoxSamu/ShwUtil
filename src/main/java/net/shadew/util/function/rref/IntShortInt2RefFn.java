package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code short} and an {@code int} and returns an object.
 */
public interface IntShortInt2RefFn<R> {
    R invoke(int p1, short p2, int p3);
}
