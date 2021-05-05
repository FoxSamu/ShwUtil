package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code long}, a {@code long} and an object and returns a {@code byte}.
 */
public interface LongLongRef2ByteFn<P3> {
    byte invoke(long p1, long p2, P3 p3);
}
