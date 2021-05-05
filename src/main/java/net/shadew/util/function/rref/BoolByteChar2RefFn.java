package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code byte} and a {@code char} and returns an object.
 */
public interface BoolByteChar2RefFn<R> {
    R invoke(boolean p1, byte p2, char p3);
}
