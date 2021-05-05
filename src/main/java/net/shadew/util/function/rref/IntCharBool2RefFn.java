package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code char} and a {@code boolean} and returns an object.
 */
public interface IntCharBool2RefFn<R> {
    R invoke(int p1, char p2, boolean p3);
}
