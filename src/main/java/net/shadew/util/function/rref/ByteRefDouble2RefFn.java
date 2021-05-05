package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, an object and a {@code double} and returns an object.
 */
public interface ByteRefDouble2RefFn<P2, R> {
    R invoke(byte p1, P2 p2, double p3);
}
