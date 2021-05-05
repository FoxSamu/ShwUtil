package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code short} and an {@code int} and returns an object.
 */
public interface BoolShortInt2RefFn<R> {
    R invoke(boolean p1, short p2, int p3);
}
