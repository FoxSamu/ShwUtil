package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code byte} and a {@code boolean} and returns an object.
 */
public interface BoolByteBool2RefFn<R> {
    R invoke(boolean p1, byte p2, boolean p3);
}
