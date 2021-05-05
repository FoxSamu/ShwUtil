package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code long}, an {@code int} and an object and returns a {@code byte}.
 */
public interface LongIntRef2ByteFn<P3> {
    byte invoke(long p1, int p2, P3 p3);
}
