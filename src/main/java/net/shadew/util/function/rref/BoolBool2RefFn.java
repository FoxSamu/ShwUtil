package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean} and a {@code boolean} and returns an object.
 */
public interface BoolBool2RefFn<R> {
    R invoke(boolean p1, boolean p2);
}
