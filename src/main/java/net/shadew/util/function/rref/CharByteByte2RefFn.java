package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code byte} and a {@code byte} and returns an object.
 */
public interface CharByteByte2RefFn<R> {
    R invoke(char p1, byte p2, byte p3);
}
