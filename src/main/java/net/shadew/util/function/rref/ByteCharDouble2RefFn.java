package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code char} and a {@code double} and returns an object.
 */
public interface ByteCharDouble2RefFn<R> {
    R invoke(byte p1, char p2, double p3);
}
