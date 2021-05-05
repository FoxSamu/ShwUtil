package net.shadew.util.function.rref;

/**
 * A function that takes an {@code int}, a {@code byte} and a {@code char} and returns an object.
 */
public interface IntByteChar2RefFn<R> {
    R invoke(int p1, byte p2, char p3);
}
