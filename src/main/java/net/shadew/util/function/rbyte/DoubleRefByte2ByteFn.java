package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code double}, an object and a {@code byte} and returns a {@code byte}.
 */
public interface DoubleRefByte2ByteFn<P2> {
    byte invoke(double p1, P2 p2, byte p3);
}
