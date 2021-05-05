package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code byte}, an object and an object and returns a {@code long}.
 */
public interface ByteRefRef2LongFn<P2, P3> {
    long invoke(byte p1, P2 p2, P3 p3);
}
