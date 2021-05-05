package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code short}, an object and a {@code byte} and returns a {@code byte}.
 */
public interface ShortRefByte2ByteFn<P2> {
    byte invoke(short p1, P2 p2, byte p3);
}
