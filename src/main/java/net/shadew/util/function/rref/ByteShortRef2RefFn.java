package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code short} and an object and returns an object.
 */
public interface ByteShortRef2RefFn<P3, R> {
    R invoke(byte p1, short p2, P3 p3);
}
