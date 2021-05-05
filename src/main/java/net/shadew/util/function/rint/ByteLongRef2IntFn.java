package net.shadew.util.function.rint;

/**
 * A function that takes a {@code byte}, a {@code long} and an object and returns an {@code int}.
 */
public interface ByteLongRef2IntFn<P3> {
    int invoke(byte p1, long p2, P3 p3);
}
