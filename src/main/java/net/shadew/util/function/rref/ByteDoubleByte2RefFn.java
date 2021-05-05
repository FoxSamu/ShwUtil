package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code double} and a {@code byte} and returns an object.
 */
public interface ByteDoubleByte2RefFn<R> {
    R invoke(byte p1, double p2, byte p3);
}
