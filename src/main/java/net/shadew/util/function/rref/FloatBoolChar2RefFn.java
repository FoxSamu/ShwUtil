package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code boolean} and a {@code char} and returns an object.
 */
public interface FloatBoolChar2RefFn<R> {
    R invoke(float p1, boolean p2, char p3);
}
