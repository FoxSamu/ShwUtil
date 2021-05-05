package net.shadew.util.function.rvoid;

/**
 * A function that takes a {@code long}, a {@code float} and an object and returns nothing.
 */
public interface LongFloatRef2VoidFn<P3> {
    void invoke(long p1, float p2, P3 p3);
}
