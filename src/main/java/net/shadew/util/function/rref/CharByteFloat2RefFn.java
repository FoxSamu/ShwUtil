package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code byte} and a {@code float} and returns an object.
 */
public interface CharByteFloat2RefFn<R> {
    R invoke(Char p1, Byte p2, Float p3);
}
