package net.shadew.util.function.rref;

/**
 * A function that takes a {@code boolean}, an {@code int} and a {@code byte} and returns an object.
 */
public interface BoolIntByte2RefFn<R> {
    R invoke(boolean p1, int p2, byte p3);
}
