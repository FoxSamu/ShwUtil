package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code byte} and a {@code float} and returns an object.
 */
public interface ShortByteFloat2RefFn<R> {
    R invoke(short p1, byte p2, float p3);
}
