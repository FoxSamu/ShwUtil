package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code byte} and a {@code long} and returns an object.
 */
public interface CharByteLong2RefFn<R> {
    R invoke(char p1, byte p2, long p3);
}
