package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean} and a {@code float} and returns an object.
 */
public interface BoolFloat2RefFn<R> {
    R invoke(boolean p1, float p2);
}
