package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte} and an object and returns an object.
 */
public interface ByteRef2RefFn<P2, R> {
    R invoke(byte p1, P2 p2);
}
