package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, an object and a {@code char} and returns an object.
 */
public interface ByteRefChar2RefFn<P2, R> {
    R invoke(byte p1, P2 p2, char p3);
}
