package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code byte} and a {@code char} and returns an object.
 */
public interface BoolByteChar2RefFn<R> {
    R invoke(Bool p1, Byte p2, Char p3);
}
