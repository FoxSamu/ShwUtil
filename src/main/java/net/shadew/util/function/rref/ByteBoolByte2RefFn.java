package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code boolean} and a {@code byte} and returns an object.
 */
public interface ByteBoolByte2RefFn<R> {
    R invoke(byte p1, boolean p2, byte p3);
}
