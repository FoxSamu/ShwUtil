package net.shadew.util.function.rref;

/**
 * A function that takes a {@code byte} and a {@code boolean} and returns an object.
 */
public interface ByteBool2RefFn<R> {
    R invoke(byte p1, boolean p2);
}
