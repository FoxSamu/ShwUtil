package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code byte} and a {@code boolean} and returns an object.
 */
public interface ByteByteBool2RefFn<R> {
    R invoke(byte p1, byte p2, boolean p3);
}
