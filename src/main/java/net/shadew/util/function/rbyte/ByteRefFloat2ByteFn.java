package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code byte}, an object and a {@code float} and returns a {@code byte}.
 */
public interface ByteRefFloat2ByteFn<P2> {
    byte invoke(byte p1, P2 p2, float p3);
}
