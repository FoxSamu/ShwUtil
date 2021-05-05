package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code long} and a {@code long} and returns an object.
 */
public interface BoolLongLong2RefFn<R> {
    R invoke(Bool p1, Long p2, Long p3);
}
