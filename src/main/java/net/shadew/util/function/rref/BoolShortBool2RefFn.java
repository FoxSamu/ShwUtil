package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code short} and a {@code boolean} and returns an object.
 */
public interface BoolShortBool2RefFn<R> {
    R invoke(boolean p1, short p2, boolean p3);
}
