package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code boolean} and a {@code float} and returns an object.
 */
public interface ShortBoolFloat2RefFn<R> {
    R invoke(short p1, boolean p2, float p3);
}
