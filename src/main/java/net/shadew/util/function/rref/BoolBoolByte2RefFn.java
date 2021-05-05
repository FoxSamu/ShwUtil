package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code boolean} and a {@code byte} and returns an object.
 */
public interface BoolBoolByte2RefFn<R> {
    R invoke(boolean p1, boolean p2, byte p3);
}
