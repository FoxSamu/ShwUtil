package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code boolean} and a {@code byte} and returns an object.
 */
public interface ShortBoolByte2RefFn<R> {
    R invoke(short p1, boolean p2, byte p3);
}
