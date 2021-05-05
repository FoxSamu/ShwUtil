package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code long}, a {@code boolean} and an object and returns a {@code byte}.
 */
public interface LongBoolRef2ByteFn<P3> {
    byte invoke(long p1, boolean p2, P3 p3);
}
