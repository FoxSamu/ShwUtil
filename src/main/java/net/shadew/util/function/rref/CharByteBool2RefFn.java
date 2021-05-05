package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code byte} and a {@code boolean} and returns an object.
 */
public interface CharByteBool2RefFn<R> {
    R invoke(char p1, byte p2, boolean p3);
}
