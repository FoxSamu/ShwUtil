package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte} and a {@code double} and returns an object.
 */
public interface ByteDouble2RefFn<R> {
    R invoke(byte p1, double p2);
}
