package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code double}, a {@code long} and an object and returns a {@code byte}.
 */
public interface DoubleLongRef2ByteFn<P3> {
    byte invoke(double p1, long p2, P3 p3);
}
