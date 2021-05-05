package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code long} and a {@code short} and returns an object.
 */
public interface BoolLongShort2RefFn<R> {
    R invoke(boolean p1, long p2, short p3);
}
