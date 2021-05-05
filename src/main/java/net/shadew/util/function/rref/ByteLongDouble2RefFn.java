package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code long} and a {@code double} and returns an object.
 */
public interface ByteLongDouble2RefFn<R> {
    R invoke(byte p1, long p2, double p3);
}
