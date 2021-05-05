package net.shadew.util.function.rbyte;

/**
 * A function that takes an object, a {@code byte} and a {@code long} and returns a {@code byte}.
 */
public interface RefByteLong2ByteFn<P1> {
    byte invoke(P1 p1, byte p2, long p3);
}
