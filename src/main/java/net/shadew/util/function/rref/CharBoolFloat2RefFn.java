package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code boolean} and a {@code float} and returns an object.
 */
public interface CharBoolFloat2RefFn<R> {
    R invoke(char p1, boolean p2, float p3);
}
