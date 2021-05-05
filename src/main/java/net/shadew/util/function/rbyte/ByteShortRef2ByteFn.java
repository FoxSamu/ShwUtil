package net.shadew.util.function.rbyte;

/**
 * A function that takes a {@code byte}, a {@code short} and an object and returns a {@code byte}.
 */
public interface ByteShortRef2ByteFn<P3> {
    byte invoke(byte p1, short p2, P3 p3);
}
