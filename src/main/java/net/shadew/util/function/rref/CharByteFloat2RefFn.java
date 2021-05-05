package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code byte} and a {@code float} and returns an object.
 */
public interface CharByteFloat2RefFn<R> {
    R invoke(char p1, byte p2, float p3);
}
