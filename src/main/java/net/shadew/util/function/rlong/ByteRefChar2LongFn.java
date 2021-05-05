package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code byte}, an object and a {@code char} and returns a {@code long}.
 */
public interface ByteRefChar2LongFn<P2> {
    long invoke(byte p1, P2 p2, char p3);
}
