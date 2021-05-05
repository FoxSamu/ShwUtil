package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code char} and a {@code long} and returns an object.
 */
public interface BoolCharLong2RefFn<R> {
    R invoke(boolean p1, char p2, long p3);
}
