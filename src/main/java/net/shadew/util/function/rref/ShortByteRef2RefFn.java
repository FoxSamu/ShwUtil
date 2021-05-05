package net.shadew.util.function.rref;

/**
 * A function that takes a {@code short}, a {@code byte} and an object and returns an object.
 */
public interface ShortByteRef2RefFn<P3, R> {
    R invoke(short p1, byte p2, P3 p3);
}
