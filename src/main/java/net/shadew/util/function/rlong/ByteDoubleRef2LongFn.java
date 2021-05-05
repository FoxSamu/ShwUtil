package net.shadew.util.function.rlong;

/**
 * A function that takes a {@code byte}, a {@code double} and an object and returns a {@code long}.
 */
public interface ByteDoubleRef2LongFn<P3> {
    long invoke(byte p1, double p2, P3 p3);
}
