package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code byte}, a {@code short} and an object and returns a {@code long}.
 */
public interface ByteShortRef2LongFn<P3> {
    long invoke(byte p1, short p2, P3 p3);
}
