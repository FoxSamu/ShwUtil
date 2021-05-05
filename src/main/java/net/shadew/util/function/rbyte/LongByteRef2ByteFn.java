package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code long}, a {@code byte} and an object and returns a {@code byte}.
 */
public interface LongByteRef2ByteFn<P3> {
    byte invoke(long p1, byte p2, P3 p3);
}
