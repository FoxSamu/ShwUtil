package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code byte} and a {@code byte} and returns an object.
 */
public interface IntByteByte2RefFn<R> {
    R invoke(int p1, byte p2, byte p3);
}
