package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code byte}, a {@code byte} and an object and returns a {@code long}.
 */
public interface ByteByteRef2LongFn<P3> {
    long invoke(byte p1, byte p2, P3 p3);
}
