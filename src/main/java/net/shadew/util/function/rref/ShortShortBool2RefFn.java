package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code short} and a {@code boolean} and returns an object.
 */
public interface ShortShortBool2RefFn<R> {
    R invoke(short p1, short p2, boolean p3);
}
