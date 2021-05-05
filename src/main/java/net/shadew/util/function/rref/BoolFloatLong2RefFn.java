package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code float} and a {@code long} and returns an object.
 */
public interface BoolFloatLong2RefFn<R> {
    R invoke(boolean p1, float p2, long p3);
}
