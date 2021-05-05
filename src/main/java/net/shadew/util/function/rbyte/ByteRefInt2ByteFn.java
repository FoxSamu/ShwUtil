package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code byte}, an object and an {@code int} and returns a {@code byte}.
 */
public interface ByteRefInt2ByteFn<P2> {
    byte invoke(byte p1, P2 p2, int p3);
}
