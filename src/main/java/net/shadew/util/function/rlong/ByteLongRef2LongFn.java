package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code byte}, a {@code long} and an object and returns a {@code long}.
 */
public interface ByteLongRef2LongFn<P3> {
    long invoke(byte p1, long p2, P3 p3);
}
