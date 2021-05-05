package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code byte} and a {@code char} and returns an object.
 */
public interface ShortByteChar2RefFn<R> {
    R invoke(short p1, byte p2, char p3);
}
