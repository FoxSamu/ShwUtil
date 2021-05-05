package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, a {@code byte} and an object and returns an object.
 */
public interface BoolByteRef2RefFn<P3, R> {
    R invoke(boolean p1, byte p2, P3 p3);
}
