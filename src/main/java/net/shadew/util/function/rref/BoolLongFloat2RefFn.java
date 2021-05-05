package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code long} and a {@code float} and returns an object.
 */
public interface BoolLongFloat2RefFn<R> {
    R invoke(boolean p1, long p2, float p3);
}
