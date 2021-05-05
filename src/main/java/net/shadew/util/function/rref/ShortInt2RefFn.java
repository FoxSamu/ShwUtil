package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short} and an {@code int} and returns an object.
 */
public interface ShortInt2RefFn<R> {
    R invoke(short p1, int p2);
}
