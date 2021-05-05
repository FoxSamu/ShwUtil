package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code short} and a {@code byte} and returns an object.
 */
public interface BoolShortByte2RefFn<R> {
    R invoke(boolean p1, short p2, byte p3);
}
