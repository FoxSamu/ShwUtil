package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code long}, a {@code char} and an object and returns a {@code byte}.
 */
public interface LongCharRef2ByteFn<P3> {
    byte invoke(long p1, char p2, P3 p3);
}
