package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code char} and a {@code boolean} and returns an object.
 */
public interface ByteCharBool2RefFn<R> {
    R invoke(byte p1, char p2, boolean p3);
}
