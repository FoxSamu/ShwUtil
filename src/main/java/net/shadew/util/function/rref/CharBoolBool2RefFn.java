package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code boolean} and a {@code boolean} and returns an object.
 */
public interface CharBoolBool2RefFn<R> {
    R invoke(char p1, boolean p2, boolean p3);
}
