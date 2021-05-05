package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code byte} and an object and returns an object.
 */
public interface ByteByteRef2RefFn<P3, R> {
    R invoke(byte p1, byte p2, P3 p3);
}
