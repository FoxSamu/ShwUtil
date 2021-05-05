package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code char} and a {@code boolean} and returns an object.
 */
public interface CharCharBool2RefFn<R> {
    R invoke(char p1, char p2, boolean p3);
}
