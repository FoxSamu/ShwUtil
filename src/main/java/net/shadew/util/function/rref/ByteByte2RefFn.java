package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte} and a {@code byte} and returns an object.
 */
public interface ByteByte2RefFn<R> {
    R invoke(byte p1, byte p2);
}
