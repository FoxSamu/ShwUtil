package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code char}, an object and a {@code byte} and returns a {@code byte}.
 */
public interface CharRefByte2ByteFn<P2> {
    byte invoke(char p1, P2 p2, byte p3);
}
