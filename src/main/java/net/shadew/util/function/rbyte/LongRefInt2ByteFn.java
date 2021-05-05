package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code long}, an object and an {@code int} and returns a {@code byte}.
 */
public interface LongRefInt2ByteFn<P2> {
    byte invoke(long p1, P2 p2, int p3);
}
