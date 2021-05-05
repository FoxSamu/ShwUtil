package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code byte} and a {@code byte} and returns an object.
 */
public interface BoolByteByte2RefFn<R> {
    R invoke(boolean p1, byte p2, byte p3);
}
