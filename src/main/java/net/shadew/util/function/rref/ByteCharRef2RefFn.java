package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code char} and an object and returns an object.
 */
public interface ByteCharRef2RefFn<P3, R> {
    R invoke(byte p1, char p2, P3 p3);
}
