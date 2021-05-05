package net.shadew.util.function.rref;

/**
 * A function that takes an object, a {@code char} and a {@code byte} and returns an object.
 */
public interface RefCharByte2RefFn<P1, R> {
    R invoke(P1 p1, char p2, byte p3);
}
