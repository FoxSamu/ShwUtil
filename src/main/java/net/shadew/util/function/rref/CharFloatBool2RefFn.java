package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code float} and a {@code boolean} and returns an object.
 */
public interface CharFloatBool2RefFn<R> {
    R invoke(char p1, float p2, boolean p3);
}
