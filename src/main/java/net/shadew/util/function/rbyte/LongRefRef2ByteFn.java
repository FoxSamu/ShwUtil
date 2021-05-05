package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code long}, an object and an object and returns a {@code byte}.
 */
public interface LongRefRef2ByteFn<P2, P3> {
    byte invoke(Long p1, P2 p2, P3 p3);
}
