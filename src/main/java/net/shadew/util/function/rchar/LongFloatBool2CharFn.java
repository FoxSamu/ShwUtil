package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code long}, a {@code float} and a {@code boolean} and returns a {@code char}.
 */
public interface LongFloatBool2CharFn {
    char invoke(long p1, float p2, boolean p3);
}