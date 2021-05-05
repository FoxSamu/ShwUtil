package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code long}, a {@code byte} and an object and returns a {@code long}.
 */
public interface LongByteRef2LongFn<P3> {
    long invoke(long p1, byte p2, P3 p3);
}
