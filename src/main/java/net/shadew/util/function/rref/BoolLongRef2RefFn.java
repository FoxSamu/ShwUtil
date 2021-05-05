package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code long} and an object and returns an object.
 */
public interface BoolLongRef2RefFn<P3, R> {
    R invoke(boolean p1, long p2, P3 p3);
}
