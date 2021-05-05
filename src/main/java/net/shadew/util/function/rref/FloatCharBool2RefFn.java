package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code char} and a {@code boolean} and returns an object.
 */
public interface FloatCharBool2RefFn<R> {
    R invoke(float p1, char p2, boolean p3);
}
