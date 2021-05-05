package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code long}, a {@code boolean} and an object and returns a {@code char}.
 */
public interface LongBoolRef2CharFn<P3> {
    char invoke(long p1, boolean p2, P3 p3);
}
