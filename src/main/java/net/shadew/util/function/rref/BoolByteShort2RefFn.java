package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code byte} and a {@code short} and returns an object.
 */
public interface BoolByteShort2RefFn<R> {
    R invoke(boolean p1, byte p2, short p3);
}
