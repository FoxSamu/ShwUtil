package net.shadew.util.function.rbyte;

/**
 * A function that takes an {@code int}, a {@code long} and an object and returns a {@code byte}.
 */
public interface IntLongRef2ByteFn<P3> {
    byte invoke(int p1, long p2, P3 p3);
}
