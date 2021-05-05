package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code long}, a {@code float} and an object and returns a {@code byte}.
 */
public interface LongFloatRef2ByteFn<P3> {
    byte invoke(long p1, float p2, P3 p3);
}
