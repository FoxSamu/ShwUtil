package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int} and a {@code short} and returns an object.
 */
public interface IntShort2RefFn<R> {
    R invoke(int p1, short p2);
}
