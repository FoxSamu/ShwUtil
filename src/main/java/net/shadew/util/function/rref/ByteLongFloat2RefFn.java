package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code long} and a {@code float} and returns an object.
 */
public interface ByteLongFloat2RefFn<R> {
    R invoke(byte p1, long p2, float p3);
}
