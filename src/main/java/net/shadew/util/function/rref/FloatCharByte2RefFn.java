package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code char} and a {@code byte} and returns an object.
 */
public interface FloatCharByte2RefFn<R> {
    R invoke(float p1, char p2, byte p3);
}
