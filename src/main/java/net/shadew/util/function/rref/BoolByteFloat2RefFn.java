package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code byte} and a {@code float} and returns an object.
 */
public interface BoolByteFloat2RefFn<R> {
    R invoke(boolean p1, byte p2, float p3);
}
