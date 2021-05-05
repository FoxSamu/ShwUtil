package net.shadew.util.function.rchar;

/**
 * A function that takes a {@code long}, a {@code float} and an object and returns a {@code char}.
 */
public interface LongFloatRef2CharFn<P3> {
    char invoke(long p1, float p2, P3 p3);
}
