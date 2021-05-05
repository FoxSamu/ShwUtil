package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code boolean} and a {@code byte} and returns an object.
 */
public interface IntBoolByte2RefFn<R> {
    R invoke(int p1, boolean p2, byte p3);
}
