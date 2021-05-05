package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code float} and a {@code byte} and returns an object.
 */
public interface CharFloatByte2RefFn<R> {
    R invoke(char p1, float p2, byte p3);
}
