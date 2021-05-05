package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code short} and a {@code float} and returns an object.
 */
public interface BoolShortFloat2RefFn<R> {
    R invoke(boolean p1, short p2, float p3);
}
