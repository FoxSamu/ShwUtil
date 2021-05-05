package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code long} and an object and returns a {@code byte}.
 */
public interface LongRef2ByteFn<P2> {
    byte invoke(long p1, P2 p2);
}
