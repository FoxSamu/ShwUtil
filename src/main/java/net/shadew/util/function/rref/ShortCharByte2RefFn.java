package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code char} and a {@code byte} and returns an object.
 */
public interface ShortCharByte2RefFn<R> {
    R invoke(short p1, char p2, byte p3);
}
