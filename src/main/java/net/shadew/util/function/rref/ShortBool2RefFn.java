package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short} and a {@code boolean} and returns an object.
 */
public interface ShortBool2RefFn<R> {
    R invoke(short p1, boolean p2);
}
