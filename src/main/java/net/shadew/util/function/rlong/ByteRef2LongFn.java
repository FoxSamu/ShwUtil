package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code byte} and an object and returns a {@code long}.
 */
public interface ByteRef2LongFn<P2> {
    long invoke(byte p1, P2 p2);
}
