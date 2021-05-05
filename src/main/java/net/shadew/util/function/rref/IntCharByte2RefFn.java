package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code char} and a {@code byte} and returns an object.
 */
public interface IntCharByte2RefFn<R> {
    R invoke(int p1, char p2, byte p3);
}
