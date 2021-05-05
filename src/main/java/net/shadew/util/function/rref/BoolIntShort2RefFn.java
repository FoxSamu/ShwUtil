package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, an {@code int} and a {@code short} and returns an object.
 */
public interface BoolIntShort2RefFn<R> {
    R invoke(boolean p1, int p2, short p3);
}
