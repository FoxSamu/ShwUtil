package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code short}, a {@code long} and an object and returns a {@code byte}.
 */
public interface ShortLongRef2ByteFn<P3> {
    byte invoke(short p1, long p2, P3 p3);
}
