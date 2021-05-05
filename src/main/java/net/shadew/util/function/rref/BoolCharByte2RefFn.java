package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code char} and a {@code byte} and returns an object.
 */
public interface BoolCharByte2RefFn<R> {
    R invoke(boolean p1, char p2, byte p3);
}
