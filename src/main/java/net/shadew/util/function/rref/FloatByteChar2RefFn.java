package net.shadew.util.function.rref;

/**
 * A function that takes a {@code float}, a {@code byte} and a {@code char} and returns an object.
 */
public interface FloatByteChar2RefFn<R> {
    R invoke(float p1, byte p2, char p3);
}
