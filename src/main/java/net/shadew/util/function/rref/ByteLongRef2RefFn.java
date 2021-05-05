package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code long} and an object and returns an object.
 */
public interface ByteLongRef2RefFn<P3, R> {
    R invoke(byte p1, long p2, P3 p3);
}
