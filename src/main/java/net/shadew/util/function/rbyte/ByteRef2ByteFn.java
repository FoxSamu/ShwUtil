package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code byte} and an object and returns a {@code byte}.
 */
public interface ByteRef2ByteFn<P2> {
    byte invoke(byte p1, P2 p2);
}
