package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, an {@code int} and a {@code byte} and returns an object.
 */
public interface ShortIntByte2RefFn<R> {
    R invoke(Short p1, Int p2, Byte p3);
}
