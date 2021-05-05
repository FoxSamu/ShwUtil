package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte} and a {@code float} and returns an object.
 */
public interface ByteFloat2RefFn<R> {
    R invoke(byte p1, float p2);
}
