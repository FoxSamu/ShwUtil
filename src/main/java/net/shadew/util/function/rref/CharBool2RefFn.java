package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char} and a {@code boolean} and returns an object.
 */
public interface CharBool2RefFn<R> {
    R invoke(char p1, boolean p2);
}
