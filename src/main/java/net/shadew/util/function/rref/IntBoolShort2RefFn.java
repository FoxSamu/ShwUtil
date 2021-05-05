package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code boolean} and a {@code short} and returns an object.
 */
public interface IntBoolShort2RefFn<R> {
    R invoke(int p1, boolean p2, short p3);
}
