package net.shadew.util.function.rref;

/**
 * A function that takes a {@code char}, a {@code boolean} and a {@code byte} and returns an object.
 */
public interface CharBoolByte2RefFn<R> {
    R invoke(char p1, boolean p2, byte p3);
}
