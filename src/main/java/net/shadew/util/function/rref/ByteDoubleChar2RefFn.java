package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code double} and a {@code char} and returns an object.
 */
public interface ByteDoubleChar2RefFn<R> {
    R invoke(byte p1, double p2, char p3);
}
