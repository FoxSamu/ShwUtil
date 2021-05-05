package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte}, a {@code boolean} and a {@code short} and returns an object.
 */
public interface ByteBoolShort2RefFn<R> {
    R invoke(byte p1, boolean p2, short p3);
}
