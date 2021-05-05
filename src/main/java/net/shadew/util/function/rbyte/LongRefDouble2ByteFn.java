package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code long}, an object and a {@code double} and returns a {@code byte}.
 */
public interface LongRefDouble2ByteFn<P2> {
    byte invoke(long p1, P2 p2, double p3);
}
